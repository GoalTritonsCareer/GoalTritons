package com.careerpath.springboot.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.careerpath.springboot.common.Result;
import com.careerpath.springboot.entity.*;
import com.careerpath.springboot.mapper.UserMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock.Catch;
import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.Date;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



@RestController
@RequestMapping("/api/user")
public class UserController{

    @Resource
    UserMapper userMapper;

    @PostMapping("/register")
    public Result<?> register(@RequestBody User user) {
        User res = userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getEmail,user.getEmail()));
        if (res != null) {
            return Result.error("-1", "Email has been already registered");
        }
        user.setDate_reg(new Date());
        userMapper.insert(user);
        return Result.success();
    }

    @PostMapping("/subscribe")
    public Result<?> subscribe(@RequestBody String email) {

        
        System.out.println(email + System.getProperty("user.dir"));


        String json;
        try {
            
            json = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/springboot/src/main/java/com/careerpath/springboot/subscriber/subscribers.json")));
            

            JsonObject newJ = new Gson().fromJson(json, JsonObject.class);
            if (newJ == null) {
                System.out.println("null boject");
            }

            //System.out.print(newJ);

            JsonArray arr = newJ.getAsJsonArray("subscribers");

            //System.out.println(arr);
            for (int i = 0; i < arr.size(); i++) {
                String post_id = arr.get(i).getAsJsonObject().getAsString();
                System.out.println(post_id);
                if (post_id == email) {
                    return Result.error(json, "account already subscribed");
                }
            }


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        


        

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