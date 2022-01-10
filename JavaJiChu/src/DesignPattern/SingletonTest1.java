package DesignPattern;
//单例模式-懒汉式 什么时候用，什么时候创建对象
public class SingletonTest1 {
    public static void main(String[] args) {

    }
}
class Order{

    private Order(){}

    private static Order order=null;

    public static Order getInstance(){
        if (order ==null){//判断创建过对象没有，
            order=new Order();
        }
        return order;
    }
}
