package com.zhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *计算一个人出生了多少天
 * 1.使用欧冠Scanner中的next方法获取出生日期
 * 2.使用DateFormat类的方法parse 把字符串的出生日期解析为date格式的出生日期
 * 3.把Date格式的出生日期转换为毫秒值
 * 4.获取当前的日期转换为毫秒值
 * 5.使用当前日期的毫秒值减去出生日期的毫秒值
 * 6.把毫秒值转换为天
* */
public class Demo01ToString {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期");
        SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
        Date birthday= sd.parse(sc.next());
        System.out.println(birthday);
        System.out.println(new Date());
        System.out.println((new Date().getTime()-birthday.getTime())/1000/60/60/24);

     }
}
