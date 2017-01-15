package com.nong.dao;

import com.nong.base.dao.BaseDao;
import com.nong.model.User;

import java.util.List;

/**
 * Created by jackeyleon on 2016/12/29.
 */
public interface UserDao extends BaseDao<User> {
    List<User> queryUserAll();
}
