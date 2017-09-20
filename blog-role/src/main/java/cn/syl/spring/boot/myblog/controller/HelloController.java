package cn.syl.spring.boot.myblog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Hello控制器
@RestController //=@Controller 和@ResponseBody的组合
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello word!";
    }
}
