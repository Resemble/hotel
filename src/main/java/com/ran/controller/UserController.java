package com.ran.controller;

import com.ran.entity.UserEntity;
import com.ran.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller public class UserController {

    @Autowired UserService userService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }


    @RequestMapping("/list") public String getUsers(Model model) {
        List<UserEntity> users = userService.getUsers();
        model.addAttribute("users", users);
        return "user/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "user/userAdd";
    }

    @RequestMapping("/add")
    public String save(UserEntity user) {
        userService.save(user);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model, Long id) {
        UserEntity user=userService.getUser(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String update(UserEntity userEntity) {
        userService.update(userEntity);
        return "redirect:/list";
    }

    @RequestMapping(value="/delete")
    public String delete(Long id) {
        userService.delete(id);
        return "redirect:/list";
    }
}
