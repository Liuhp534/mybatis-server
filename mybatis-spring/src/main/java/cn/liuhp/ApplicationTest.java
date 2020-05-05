package cn.liuhp;

import cn.liuhp.domain.User;
import cn.liuhp.mapper.UserMapper;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: liuhp534
 * @create: 2020-05-05 16:22
 */
public class ApplicationTest {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        System.out.println(userMapper);
        User user = userMapper.selectUser(1);
        System.out.println("name: " + user.getUsername());
    }

}
