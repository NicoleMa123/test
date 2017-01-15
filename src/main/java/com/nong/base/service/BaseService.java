package com.nong.base.service;

/**
 * Created by jackeyleon on 2016/12/29.
 */
public interface BaseService<T> {
    public <V extends  T> V queryById(Long id);
}
