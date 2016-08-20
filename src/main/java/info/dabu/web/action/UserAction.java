package info.dabu.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import info.dabu.domain.User;
import info.dabu.service.UserService;

/**
 * Created by AlexY on 2016/8/20.
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {

    //1 封装数据
    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    //2 service
    private UserService userService;

    public void setUserService(UserService userService) {

        System.out.println("setUserService");
        this.userService = userService;
    }

    //////////////////////////////////

    /**
     * 注册
     *
     * @return
     */
    public String register() {
        userService.register(user);
        return "success";
    }

}
