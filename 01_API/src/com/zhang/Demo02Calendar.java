package com.zhang;
//日历

import java.util.Calendar;

/**
 * Calendar是一个抽象类
 * YEAR MONTH DAY_OF_MONTH HOUR
 * Calendar 无法直接创建对象使用，里面有一个静态方法叫getInstance(),该方法反悔了Calendar类的子类对象
 * static Calendar getInstance() 使用默认时区和语言环境获得一个日历
 * */
public class Demo02Calendar {
    public static void main(String[] args) {

        Calendar c=Calendar.getInstance();
        System.out.println(c);
    }

}
