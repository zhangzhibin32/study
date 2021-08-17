package com.zhang.pojo;

import org.omg.CORBA.PUBLIC_MEMBER;

public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT被创建");
    }

    public UserT(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+name);
    }
}
