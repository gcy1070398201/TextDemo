package com.ctxd.textdemo.entiy;

/**
 * Created by CTXD-24 on 2016/5/26.
 */
public class TextClass {
    private String name;
    private String gender;
    private String age;
    private String height;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "TextClass{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
