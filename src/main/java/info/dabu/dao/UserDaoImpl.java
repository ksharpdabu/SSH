package info.dabu.dao;

import info.dabu.domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by AlexY on 2016/8/20.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {




    @Override
    public void save(User user) {


        System.out.println("UserDao save invoked");
        this.getHibernateTemplate().save(user);
    }
}
