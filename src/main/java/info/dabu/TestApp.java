package info.dabu;

import info.dabu.domain.User;
import info.dabu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by AlexY on 2016/8/20.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestApp {

    @Autowired
    private UserService userService;


    @Test
    public void demo01(){
        User user = new User();
        user.setUsername("jack");
        user.setPassword("1234");
        user.setAge(18);

        userService.register(user);
    }

}
