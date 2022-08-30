package xyz.clzly.aspect;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class KeenAspectITD {

    /**
     * 新增接口和实现
     * 其中`value`属性对应于要修改的服务方法，是可以使用通配符的。
     * `defaultImpl`属性对应于该接口的某个实现。
     * */
    // @DeclareParents(value = "xyz.clzly.service.*", defaultImpl = KeenFirstImpl.class)
    // /** 接口对象*/
    // private KeenInterface keenInterface;




    // // 要mix-in若干个接口，则需要在interfaces里依次放上要添附的接口
    // @DeclareMixin(value="xyz.clzly.service.*", interfaces="{Auditor.class, MonitoringAgent.class}")
    // public AuditorMonitoringAgent mixin()
    // {
    //     return new AuditorMonitoringAgentImpl();
    // }

    // @AspectJ提供了@DeclareParents，但很少使用，而更多使用下面的@DeclareMixin作为替代
    // @AspectJ实现的Mix-in，本质是一个返回proxy对象的工厂方法，用于返回一个包裹了aspect的proxy

    // // 下面的代码等价于：declare parents: ajia.banking.domain.* implements Serializable;
    // // 由于返回null，因此只能作为对被切入类的都有Serializable的一个标记
    // @DeclareMixin("ajia.banking.domain.*")
    // public Serializable serializableMixin()
    // {
    //     return null;
    // }

    // // @DeclareMixin支持一个参数，模仿依赖注入的方式，把被切入的对象传递给工厂
    // // AuditorImp是接口Auditor的一个实现，即对Object的一个代理
    // @DeclareMixin("ajia.banking.domain.*")
    // public Auditor auditorMixin(Object mixedIn)
    // {
    //     return new AuditorImpl(mixedIn);
    // }
    //
    // // 要mix-in若干个接口，则需要在interfaces里依次放上要添附的接口
    // @DeclareMixin(value="ajia.banking.domain.*", interfaces="{Auditor.class, MonitoringAgent.class}")
    // public AuditorMonitoringAgent mixin()
    // {
    //     return new AuditorMonitoringAgentImpl();
    // }

}