package com.test.dao.impl;

/**
 * Created by Administrator on 2017/4/30.
 */
import com.test.dao.UserDao;
import com.test.model.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void addUser(User user) {

        sessionFactory.getCurrentSession().save(user);

    }

}
