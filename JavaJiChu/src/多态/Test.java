package 多态;

public class Test {
    public static void main(String[] args) {
        InstanceTest test=new InstanceTest();
        test.method(new Graduate());
    }
}
