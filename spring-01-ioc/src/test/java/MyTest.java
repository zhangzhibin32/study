import com.zhang.dao.UserDaoMysqlImpl;
import com.zhang.service.UserService;
import com.zhang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层，dao层他们不需要接触
        /**UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();*/
        //获取ApplicationContext：拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //需要什么就直接get什么
        UserServiceImpl service = (UserServiceImpl) context.getBean("userService");
        service.getUser();
    }
}
