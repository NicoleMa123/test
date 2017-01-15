package com.nong.dao.impl;

import com.nong.base.dao.BaseDaoImpl;
import com.nong.dao.UserDao;
import com.nong.model.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jackeyleon on 2016/12/29.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    public List<User> queryUserAll() {
       logger.info(namespace);
        String sqlName = getSqlName("selectAll");
        return  sqlSession.selectList(sqlName);
    }
}
