package com.nong.base.service;

import com.nong.base.dao.BaseDao;

/**
 * Created by jackeyleon on 2016/12/29.
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    public abstract BaseDao<T> getBaseDao();
    public <V extends T> V queryById(Long id) {
        return getBaseDao().queryById(id);
    }
}
