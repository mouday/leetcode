package com.pengshiyu;

import com.alibaba.fastjson.JSONObject;

public class FastJsonDemo {
    public static void main(String[] args) {
        String userString = "{\"age\":1, \"name\": \"Tom\"}";
        JSONObject userJson = JSONObject.parseObject(userString);

        System.out.println(userJson.get("name"));
        // Tom
        // User user = JSON.toJavaObject(userJson, User.class);
    }

}
