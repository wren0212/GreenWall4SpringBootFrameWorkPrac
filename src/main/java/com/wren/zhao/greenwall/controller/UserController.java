package com.wren.zhao.greenwall.controller;

import com.wren.zhao.greenwall.dto.User;
import com.wren.zhao.greenwall.service.UserService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wren.zhao on 2017/9/10.
 */
@Log
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.getHscode());
            log.info("user.getAge():"+user.getHscode());
        }
        return user;
    }
}
