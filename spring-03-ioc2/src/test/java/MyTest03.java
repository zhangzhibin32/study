import com.zhang.pojo.User;
import com.zhang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    public static void main(String[] args) {
        //Spring容器，类似于婚介网站！
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserT user = (UserT) context.getBean("userT2");
        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");
        user.show();

    }
}
