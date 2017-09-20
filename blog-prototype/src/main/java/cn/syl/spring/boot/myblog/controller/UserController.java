package cn.syl.spring.boot.myblog.controller;

import cn.syl.spring.boot.myblog.domain.User;
import cn.syl.spring.boot.myblog.repository.UserRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//User控制器
@RestController //=@Controller 和@ResponseBody的组合
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //查询所有用户
    @GetMapping
    public ModelAndView list(Model model) {
        model.addAttribute("userList", userRepository.findAll());
        model.addAttribute("title", "用户管理");
        return new ModelAndView("users/list", "userModel", model);

    }

    //查询所有用户
    @GetMapping("{id}")
    public ModelAndView view(@PathVariable("id") Long id, Model model) {
        User user = userRepository.findOne(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "查看用户");
        return new ModelAndView("users/view", "userModel", model);
    }

    //获取创建表单页面
    @GetMapping("/form")
    public ModelAndView createForm(Model model) {
        model.addAttribute("user", new User(null, null, null));
        model.addAttribute("title", "创建表单");
        return new ModelAndView("users/form", "userModel", model);
    }

    //保存或修改用户
    @PostMapping
    public ModelAndView saveOrUpdateUser(User user) {
        userRepository.save(user);
        return new ModelAndView("redirect:/users"); //重定向list页面
    }


    @GetMapping("/delete/{id}")  //应该用POST
    public ModelAndView delete(@PathVariable("id") Long id) {
        userRepository.delete(id);
        return new ModelAndView("redirect:/users"); //重定向list页面
    }

    @GetMapping("/modify/{id}")
    public ModelAndView modify(@PathVariable("id") Long id, Model model) {
        User user = userRepository.findOne(id);
        model.addAttribute("user", user);
        model.addAttribute("title", "修改用户");
        return new ModelAndView("users/form", "userModel", model);

    }
}
