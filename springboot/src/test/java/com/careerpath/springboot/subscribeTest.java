package com.careerpath.springboot;

import com.careerpath.springboot.common.Result;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.IOException;

public class subscribeTest {
    public static void main(String[] args) {
        String json;
        String email = "j6wen@ucsd.edu";
        try {

            json = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir")+"/springboot/src/main/java/com/careerpath/springboot/subscriber/subscribers.json")));
            System.out.println(json);

            JsonObject newJ = new Gson().fromJson(json, JsonObject.class);
            if (newJ == null) {
                System.out.println("null object");
            }

            JsonArray arr = newJ.getAsJsonArray("subscribers");

//            System.out.println((arr.get(0)).toString());
            for (int i = 0; i < arr.size(); i++) {
                String addr = arr.get(i).toString();
                String[] fields = addr.split(":");
                addr = fields[1].substring(1, fields[1].length()-2);
                System.out.println(addr);
                if (addr.equals(email)) {
                    System.out.println("account already subscribed");
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Done");

    }
}
