package xyz.clzly.service.impl;

import xyz.clzly.component.log.LoggingUtils;
import xyz.clzly.service.KeenInterface;


public class keenServiceImpl_1 implements KeenInterface {
    @Override
    public int add10(int a) {
        LoggingUtils.info(keenServiceImpl_1.class,"参数加十结果为：{}", a + 10);
        return 0;
    }
}
