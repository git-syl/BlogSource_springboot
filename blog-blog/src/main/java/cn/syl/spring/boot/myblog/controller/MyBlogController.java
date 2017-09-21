package cn.syl.spring.boot.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Blog 控制器.
 */
@Controller
@RequestMapping("/blogs")
public class MyBlogController {

    @GetMapping
    public String listBlogs(@RequestParam(value = "order", required = false, defaultValue = "new") String order,
                            @RequestParam(value = "keyword", required = false, defaultValue = "") String keyword) {
        System.out.println("order:" + order + ";keyword:" + keyword);
        return "redirect:/index?order=" + order + "&keyword=" + keyword;
    }

}
