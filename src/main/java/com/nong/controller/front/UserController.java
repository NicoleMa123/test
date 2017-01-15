package com.nong.controller.front;

import com.nong.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.nong.service.UserService;

import java.util.List;

/**
 * Created by jackeyleon on 2016/12/27.
 */
@Controller
@RequestMapping("/")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    public UserService userService;

    @RequestMapping("test")
    public String test(){
        return "/echarts";
    }
    @RequestMapping("test1")
    public String test1(){

        logger.info("333333333333333");
        return "/echarts1";
    }

    @RequestMapping("test2")
    @ResponseBody
    public ModelMap test2(){
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("status","1");
        return modelMap;
    }

    @RequestMapping(value = "user")
    @ResponseBody
    public ModelMap userQueryById(Long id){
        ModelMap modelMap = new ModelMap();
        User  user = userService.queryById(id);
        modelMap.addAttribute("user",user);
        return modelMap;
    }

    @RequestMapping(value = "userAll")
    @ResponseBody
    public ModelMap userAll(Long id){
        ModelMap modelMap = new ModelMap();

        logger.info("select user all;");
        List<User> user = userService.queryUserAll();
        modelMap.addAttribute("user",user);
        return modelMap;
    }
}
