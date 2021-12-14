import com.zhang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    /**
     * 方法应该定义在类中，但是不能在方法中再定义方法。不能嵌套
     *
     * */
    public static boolean isTrue1(int a, int b){
        return a==b;
    }
    public static int sum(){
        int sum=0;
        for (int i = 1; i < 101; i++) {
            sum+=i;
        }
        return sum;
    }
    public static void print1(int i){
        for (int j = 0; j < i; j++) {
            System.out.println("hello world");
        }
    }
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());*/
        print1(5);
     }

}
