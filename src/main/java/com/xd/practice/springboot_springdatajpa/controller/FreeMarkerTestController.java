package com.xd.practice.springboot_springdatajpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName FreeMarkerTestController
 * @Description TODO
 * @Author xiaqi
 * @Date 12/06/2020 16:32
 * @Version 1.0
 **/
@Controller
public class FreeMarkerTestController {

    @RequestMapping("/test")
    public String testFreemarker(ModelMap modelMap){
        modelMap.addAttribute("msg", "Hello dalaoyang , this is freemarker");
        return "freemarker";
    }
}
