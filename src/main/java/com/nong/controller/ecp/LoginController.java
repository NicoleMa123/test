package com.nong.controller.ecp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jackeyleon on 2017/1/6.
 */
@Controller
@RequestMapping("/ecp/")
public class LoginController {


    @RequestMapping("/login")
    public String login(){
        return "ecp/login";

    }

    @RequestMapping("/index")
    public String index(){
        return "index";

    }


}
