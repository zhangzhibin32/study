package DesignPattern;

//单例设计模式  采取一定的方法保证在整个系统中，对某个类只存在唯一的一个对象实例。
//单例设计模式-饿汉式
/**饿汉式与懒汉式的区别
 * 饿汉式：坏处 对象加载时间过长
 *       好处 线程安全
 * 懒汉式：好处 延迟对象的创建 优先使用
 *        目前的写法：线程不安全 需要调整。
 * */
public class SingletonTest {
    public static void main(String[] args) {
        Bank bank=Bank.getInstance();
        Bank bank1=Bank.getInstance();
        System.out.println(bank==bank1);
    }

}
//饿汉式
class Bank{
    //构造器私有化
    private Bank(){ }
    //内部创建类 并且声明为静态的
    private static Bank instance=new Bank();
    //提供公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }

}
