package com.test.service.impl;

import com.test.dao.UserDao;
import com.test.model.entity.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/30.
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //@Override
    public void addUser(User user) {
        // TODO Auto-generated method stub
        userDao.addUser(user);
    }

}