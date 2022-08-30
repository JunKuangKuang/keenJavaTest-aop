package xyz.clzly.service;

import xyz.clzly.component.log.Log;
import xyz.clzly.component.log.LoggingUtils;
import xyz.clzly.component.runTime.RunTime;

public class KeenService {


    public void add1(int a) {
        LoggingUtils.info(KeenService.class,"参数加一结果为：{}", a + 1);
    }

    @Log
    public void add2(int a) {
        LoggingUtils.info(KeenService.class,"参数加二结果为：{}", a + 2);
    }

    @Log
    public int add3() {
        LoggingUtils.info(KeenService.class,"反馈结果为：{}",3);
        return 3;
    }

    @RunTime
    public void print(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LoggingUtils.info(KeenService.class,"打印字符串");
    }


}
