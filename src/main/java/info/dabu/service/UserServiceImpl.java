package info.dabu.service;

import info.dabu.dao.UserDao;
import info.dabu.domain.User;

/**
 * Created by AlexY on 2016/8/20.
 */
public class UserServiceImpl implements UserService {


    private UserDao userDao;


    public UserServiceImpl() {


        System.out.println("UserServiceImpl invoked");
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void register(User user) {
        userDao.save(user);
    }

}
