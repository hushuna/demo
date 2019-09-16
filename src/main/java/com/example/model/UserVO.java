package com.example.model;

/**
 * @author: hsn
 * @description:
 * @date: 2019/9/12 10:08
 **/
public class UserVO {
    private Long id;
    private String name;
    private Byte age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}
