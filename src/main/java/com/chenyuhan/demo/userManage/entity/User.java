package com.chenyuhan.demo.userManage.entity;
;
import org.springframework.stereotype.Component;

@Component
public class User {

    private int id;
    private String user_name ;
    private String pass_word;
    private int age;
    private String sex ;

    public User() {
    }

    public User(int id, String user_name, String pass_word, int age, String sex) {
        this.id = id;
        this.user_name = user_name;
        this.pass_word = pass_word;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
