package com.zhang.service;

import com.zhang.dao.UserDao;
import com.zhang.dao.UserDaoImpl;
import com.zhang.dao.UserDaoMysqlImpl;
import com.zhang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
