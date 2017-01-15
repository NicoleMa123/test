package com.nong.service;

import com.nong.base.service.BaseService;
import com.nong.model.User;

import java.util.List;

/**
 * Created by jackeyleon on 2016/12/29.
 */
public interface UserService extends BaseService<User>  {
    List<User> queryUserAll();
}
