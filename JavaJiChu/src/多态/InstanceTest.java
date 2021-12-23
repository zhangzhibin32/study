package 多态;

public class InstanceTest {
    public void method(Person e){
        System.out.println(e.getInfo());
        if(e instanceof Graduate){
            System.out.println("123");
        }else if(e instanceof Student){
            System.out.println("12");
        }else if(e instanceof Person){
            System.out.println("1");
        }
    }
}
