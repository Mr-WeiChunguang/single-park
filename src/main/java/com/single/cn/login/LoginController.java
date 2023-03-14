package com.single.cn.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/single")
public class LoginController {

    @PostMapping("/login")
    public String test(){
        return "test success!";
    }
}
