package com.ran.controller;

import com.ran.service.DiagnosisScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ranbo
 * @version V1.0
 * @Title:
 * @Package com.ran.controller
 * @Description:
 * @date 2018/5/11 上午10:14
 */
@Controller
public class IndexController {

    @Autowired DiagnosisScoreService diagnosisScoreService;


    @RequestMapping("/index")
    public String index(Model model) {


        return "redirect:/list";
    }

//
//    @RequestMapping("/list") public String getUsers(Model model) {
//        List<UserEntity> users = userService.getUsers();
//        model.addAttribute("users", users);
//        return "user/list";
//    }


}
