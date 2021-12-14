package 第三章泛型;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static  void printArray(ArrayList<?> list){
    System.out.println(list);
}

    public static void main(String[] args) {
        //show();
        //创建GenericClass对象，泛型 使用Integer类型
        /*GenericClass<Integer> gc=new GenericClass<>();
        gc.setName(1);
        Integer name = gc.getName();
        GenericClass<String> gc2=new GenericClass<>();
        gc2.setName("String");
        String name1 = gc2.getName();*/
        ArrayList<String> a1=new ArrayList<>();
        a1.add("ad");
        a1.add("c");
        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(1);
        a2.add(2);
        GenericClass ge=new GenericClass();
        ge.printArray(a1);
        printArray(a1);
        printArray(a2);


    }



    private static void show(){
        ArrayList<String> list=new ArrayList<>();
        list.add("abc");
        list.add("1");
        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        //使用迭代器中的方法hasNext和next遍历集合
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next.length());

        }
    }
}
