package xyz.clzly.aspect;

import xyz.clzly.component.Keen;
public aspect KeenITDAspect {
    // 新增一个字段（有无初始化）
    // private int xyz.clzly.service.KeenProService.number = 2;

    // 新增一个构造方法（报错）
    // public xyz.clzly.service.KeenProService.KeenProService() {
    //        System.out.println("初始化原始服务！");
    // }

    // 新增一个方法（新增）
    // public void xyz.clzly.service.KeenProService.setNumber(int n) {
    //      number=n;
    //      System.out.println("number字段赋值为："+this.number);
    // }

    // 重载一个方法
    // public void xyz.clzly.service.KeenProService.printPro(String str) {
    //      System.out.println("重载函数打印参数为："+str);
    // }

    // 覆盖一个方法（会报错）
    // public void xyz.clzly.service.KeenProService.printPro() {
    //        System.out.println("覆盖函数打印消息");
    //}

    // 给类新增注解
    // declare @type : xyz.clzly.service.* : @Keen(unable = true,STRING="KeenTestFiled");

    // 给方法新增注解（包括新织入的）
    // declare @method : * xyz.clzly.service.*Service.*(..): @xyz.clzly.component.Keen;

    // 给构造方法新增注解
    // declare   @constructor  : xyz.clzly.service.extend.KeenExtendService+.new(..) : @Keen;

    // 给字段新增注解,
    // declare   @field  : private String xyz.clzly.service.extend.KeenExtendService+.n* : @Keen;

    // 给类新增继承
    // declare parents: xyz.clzly.service.KeenProService  extends xyz.clzly.service.extend.KeenExtendService;


}