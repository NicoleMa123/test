package com.nong.base.dao;

/**
 * Created by jackeyleon on 2016/12/29.
 */
public interface BaseDao<T> {
    public <V extends T> V queryById(Long id);
}
