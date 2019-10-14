package shangji01.com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext01.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        userDao.say();
        System.out.println("nihao");
    }
}
