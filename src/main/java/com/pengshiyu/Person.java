package com.pengshiyu;

import com.alibaba.fastjson.JSONArray;

public class Person {
    private String name;

    private int age ;

    private JSONArray object;

    public JSONArray getObject() {
        return object;
    }

    public void setObject(JSONArray object) {
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}