package com.zhang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于<bean id="user" class="com.zhang.pojo.User"/>
//@Component 组件
@Component
public class User {
    //相当于<property name="name" value="张"/>
    @Value("炸给")
    private String name;
    /*@Value("炸给")
    public void setName(String name) {
        this.name = name;
    }*/
}
