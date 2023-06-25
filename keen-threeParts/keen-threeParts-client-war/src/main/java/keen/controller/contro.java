package  keen.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.clzly.service.KeenService;

/**

 */
@RestController
@RequestMapping("/")
public class contro {
    final private Logger  logger= LoggerFactory.getLogger(contro.class);

    /*
     * springboot部署后的访问路径http://localhost:8080/clzly/hello
     * tomcat直接部署后的访问路径http://localhost:8080/hello
     * IDEA配置部署后的运行路径是deployment里配置的 Application context字段，默认是/keen_threeParts_client_war_war_exploded
        * 建议改成  clzly，这样子也就可以通过http://localhost:8080/clzly/hello
     * http://localhost:8081/keen_threeParts_client_war_war_exploded/hello
     * */
    @RequestMapping("hello")
    public String policyClearScheduled() {
        System.out.println("keen");
        logger.info("hello");
        new KeenService().square(2);
        return "1";
    }
}
