package keen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.clzly.service.KeenService;

/**
 *
 */
@RestController
@RequestMapping("/")
public class Contro {
    /*
     * 部署后的访问路径http://localhost:8080/clzly/hello
     * IDEA配置部署后的运行路径是deployment里配置的 Application context字段，
     * 默认是/keen_threeParts_client_war_war_exploded，此时访问http://localhost:8081/keen_threeParts_client_war_war_exploded/hello
     * 建议改成  clzly，这样子也就可以通过http://localhost:8080/clzly/hello
     *
     * */
    @RequestMapping("hello")
    public String policyClearScheduled() {
        // 调用方法归属于切面路径即可，调用方不需要感知
        new KeenService().square(2);
        return "1";
    }
}
