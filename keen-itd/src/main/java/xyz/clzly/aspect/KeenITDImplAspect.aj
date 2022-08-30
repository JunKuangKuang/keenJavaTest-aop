package xyz.clzly.aspect;

import xyz.clzly.component.Keen;
/**
修改类的实现
*/
public aspect KeenITDImplAspect {
    // 给所有衍生类新增接口
    //	declare parents: xyz.clzly.service.impl.* implements xyz.clzly.service.KeenInterface;

    // 给原类新增接口
    	declare parents: xyz.clzly.service.*Service implements xyz.clzly.service.KeenInterface;
}