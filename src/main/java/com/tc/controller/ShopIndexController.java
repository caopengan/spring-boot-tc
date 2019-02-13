package com.tc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopIndexController {

    @GetMapping("/index")
    public String index(){
        return "/shop/index";
    }
}
