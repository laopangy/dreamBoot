package com.pangy.dreamBoot.controller;


import com.pangy.dreamBoot.entity.User;
import com.pangy.dreamBoot.service.UserService;
import com.pangy.dreamBoot.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/getByLogin")
    public User getByLogin(@RequestBody UserVO userVO){
        return userService.getByLogin(userVO);
    }

}
