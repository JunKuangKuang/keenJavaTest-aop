package xyz.clzly.aspect;

import xyz.clzly.component.Keen;
/**
修改接口，并且做为中介给原始服务类新增一个查看上次调用时间的功能
*/
public aspect LastTimeAspect {
    // 给所有衍生类新增接口
    //	declare parents: xyz.clzly.service.impl.* implements xyz.clzly.service.KeenInterface;

    // 给原类新增接口
    declare parents: xyz.clzly.service.*Service implements xyz.clzly.service.KeenInterface;

    // 给接口新增一个私有变量保存调用的时间
    private PropertyChangeSupport KeenInterface.propertyChangeSupport;

    //
    public void KeenInterface.addPropertyChangeListener(PropertyChangeListener listener) {
    propertyChangeSupport.addPropertyChangeListener(listener);
    }
    public void KeenInterface.removePropertyChangeListener(
    PropertyChangeListener listener) {
    propertyChangeSupport.removePropertyChangeListener(listener);
    }
}




pointcut beanCreation(KeenInterface bean)
: initialization(KeenInterface+.new(..)) && this(bean);
pointcut beanPropertyChange(KeenInterface bean, Object newValue)
: execution(void KeenInterface+.set*(*))
&& args(newValue) && this(bean);
after(KeenInterface bean) returning : beanCreation(bean) {
bean.propertyChangeSupport = new PropertyChangeSupport(bean);
}
void around(KeenInterface bean, Object newValue)
: beanPropertyChange(bean, newValue) {
String methodName
= thisJoinPointStaticPart.getSignature().getName();
String propertyName
= Introspector.decapitalize(methodName.substring(3));
Object oldValue = getPropertyValue(bean, propertyName);
proceed(bean, newValue);
bean.propertyChangeSupport.firePropertyChange(
propertyName, oldValue, newValue);
Listing 5.6 Example bean class: Customer
Listing 5.7 Aspect implementing bean functionality in a crosscutting manner
Licensed to Mylene Corbett <pedbro@gmail.com>
Download at WoWeBook.Com
Introducing members 123
}
private static Object getPropertyValue(Object bean,
String propertyName) {
try {
return BeanUtils.getProperty(bean, propertyName);
} catch (Exception ex) {
return null;
}
}
}