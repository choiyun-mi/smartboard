package com.anyang.study.Controller;

import com.anyang.study.service.UserService;
import com.anyang.study.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/usercrate")
    public String userCrateForm(Model model){
        return "usercreateform";
    }

    @PostMapping("/usercrate")
    public String userCreate(@ModelAttribute User user, Model model){
        User userEntity = UserService.addUser(user);

        model.addAttribute("result", userEntity);
        return "result";
    }
}
