package com.zzb.OOP;

import com.zzb.OOP.Shape;
import com.zzb.OOP.Student;

public class Test {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /*Shape shape =new Shape();

        shape.setHeight(50);
        shape.setWidth(100.00);
        System.out.println(shape.area());
        System.out.println(shape.girth());*/


        Student student=new Student("张三",18,"男",96,96,96);
        Student student1=new Student("张三1",18,"男",96,96,96);
        Teacher teacher=new Teacher("张三1",18,"男","96",9,"数学");
        student.sleep();
        teacher.sleep();
        System.out.println(teacher);
    }
}
