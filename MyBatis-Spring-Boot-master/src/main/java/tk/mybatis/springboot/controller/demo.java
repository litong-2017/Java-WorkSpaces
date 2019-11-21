package tk.mybatis.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tk.mybatis.springboot.model.User;
import tk.mybatis.springboot.service.UserService;


@Controller
public class demo {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/user")
    @ResponseBody
    public List<User> test1(){

    	return userService.getAll(new User());

    }

}
