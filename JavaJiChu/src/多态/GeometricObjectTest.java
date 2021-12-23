package 多态;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeometricObjectTest {
    @Test
    public void test(){
        Object o1=true?new Integer(1):new Double(2.0);
        System.out.println(o1);
    }
    @Test
    public void test1(){
        Object o1;
        if (true)
            o1=new Integer(1);
        else
            o1=new Double(2.0);
        System.out.println(o1);
    }
    @Test
    public void test2(){


        Integer m=-125;
        Integer k=-125;
        System.out.println(m==k);

        String s=new String("a");
        String a=new String("a");
        System.out.println(a==s);

    }
}