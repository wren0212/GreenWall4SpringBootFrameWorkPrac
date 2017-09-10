package com.wren.zhao.greenwall.controller;

import lombok.extern.java.Log;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wren.zhao on 2017/9/10.
 */
@Log
@Controller
public class HelloController {
    @RequestMapping("/test")
    @Cacheable(value="user-key")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        log.info("hello");
        model.addAttribute("name", name);
        return "hello";
    }
    
}
