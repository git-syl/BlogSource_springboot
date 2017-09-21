package cn.syl.spring.boot.myblog.controller;

import cn.syl.spring.boot.myblog.domain.Authority;
import cn.syl.spring.boot.myblog.domain.User;
import cn.syl.spring.boot.myblog.service.AuthorityService;
import cn.syl.spring.boot.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 主页
 */
@Controller
public class MainController {
    @Autowired
    private UserService userService;
    @Autowired
    private AuthorityService authorityService;

    private static final Long ROLE_USER_AUTHORITY_ID = 2L;

    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登陆失败，用户名或者密码错误！");
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    @PostMapping("/register")
    public String registerUser(User user) {
        //默认注册博主权限
        List<Authority> authorities = new ArrayList<>();
        authorities.add(authorityService.getAuthorityById(ROLE_USER_AUTHORITY_ID));
        user.setAuthorities(authorities);

        userService.registerUser(user);
        return "redirect:/login";
    }
}
