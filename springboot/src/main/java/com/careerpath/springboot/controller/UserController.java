package com.careerpath.springboot.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.careerpath.springboot.common.Result;
import com.careerpath.springboot.entity.*;
import com.careerpath.springboot.mapper.UserMapper;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.Date;


@RestController
@RequestMapping("/api/user")
public class UserController{

    @Resource
    UserMapper userMapper;

    @PostMapping("/register")
    public Result<?> subscribe(@RequestBody User user) {
        User res = userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getEmail,user.getEmail()));
        if (res != null) {
            return Result.error("-1", "Email has been already registered");
        }
        user.setDate_reg(new Date());
        userMapper.insert(user);
        return Result.success();
    }

//    @PostMapping("/login")
//    public Result<?> login(@RequestBody User user) {
//        User res = userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getEmail, user.getEmail())
//                .eq(User::getPassword, user.getPassword()));
//        if (res == null) {
//            return Result.error("-1", "Incorrect email and/or password");
//        }
//        return Result.success(res);
//    }
//    @PostMapping("/register")
//    public Result<?> register(@RequestBody User user) {
//        User res = userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getEmail,user.getEmail()));
//        if (res != null) {
//            return Result.error("-1", "Email has been already registered");
//        }
//        user.setDate_reg(new Date());
//        userMapper.insert(user);
//        return Result.success();
//    }
}