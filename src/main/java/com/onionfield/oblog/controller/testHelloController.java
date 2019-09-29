package com.onionfield.oblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther scw_vv@126.com
 * @Date 2019/9/29 10:03
 */

@Controller
public class testHelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(name="name") String name, Model model)
    {
        model.addAttribute("name", name);
        return "hello";
    }

}
