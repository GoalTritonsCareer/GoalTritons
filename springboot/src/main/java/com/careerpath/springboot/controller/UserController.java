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

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.time.LocalDate;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



@RestController
@RequestMapping("/api/user")
public class UserController{

//    @Resource
//    UserMapper userMapper;

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

    @PostMapping("/subscribe")
    public Result<?> subscribe(@RequestBody String email) {

//        System.out.println(email + System.getProperty("user.dir"));

        // Parse the emailString into a JsonObject
        JsonObject emailJson = new Gson().fromJson(email, JsonObject.class);
        // Retrieve the value of the "email" key as a String
        email = emailJson.get("email").getAsString();
        String json;
        try {

            json = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/springboot/src/main/java/com/careerpath/springboot/subscriber/subscribers.json")));

            JsonObject jsonObject = new Gson().fromJson(json, JsonObject.class);
            if (jsonObject == null) {
                return Result.error("-1", "An error occurred while subscribing. Please try again later.");
            }

            JsonArray subscribers = jsonObject.getAsJsonArray("subscribers");

            for (int i = 0; i < subscribers.size(); i++) {
                String value = subscribers.get(i).toString();
                JsonObject addr = new Gson().fromJson(value, JsonObject.class);
                if (addr.get("email").getAsString().equals(email)) {
                    return Result.error("-1", "Account already subscribed!");
                }
            }


            // Add the new email to the JSON object
            JsonObject newSubscriber = new JsonObject();
            newSubscriber.addProperty("id", subscribers.size()+1);
            newSubscriber.addProperty("email", email);
            newSubscriber.addProperty("date", String.valueOf(LocalDate.now()));
            subscribers.add(newSubscriber);

            // Write the updated JSON object back to the file
            try {
                Files.write(Paths.get(System.getProperty("user.dir")+"/springboot/src/main/java/com/careerpath/springboot/subscriber/subscribers.json"), new Gson().toJson(jsonObject).getBytes());
            } catch (IOException e) {
                e.printStackTrace();
                return Result.error("-1", "An error occurred while subscribing. Please try again later.");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return Result.error("-1", "An error occurred while subscribing. Please try again later.");
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