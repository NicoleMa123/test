package com.nong.service.impl;

import com.nong.base.dao.BaseDao;
import com.nong.base.service.BaseServiceImpl;
import com.nong.dao.UserDao;
import com.nong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nong.service.UserService;

import java.util.List;

/**
 * Created by jackeyleon on 2016/12/29.
 */
@Service
public class UserServiceImpl  extends BaseServiceImpl<User> implements UserService{

    @Autowired
    UserDao userDao;
    public BaseDao<User> getBaseDao() {
        return this.userDao;
    }

    public List<User> queryUserAll() {
        return userDao.queryUserAll();
    }
}
