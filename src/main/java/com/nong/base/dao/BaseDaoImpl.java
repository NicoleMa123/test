package com.nong.base.dao;

import com.nong.utils.BeanUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jackeyleon on 2016/12/29.
 */
public class BaseDaoImpl<T> implements BaseDao<T>{
    @Autowired(required = true)
    public SqlSession sqlSession;

    public String namespace  = BeanUtils.getNameSpace(this.getClass());

    public <V extends T> V queryById(Long id) {
        String sqlName =namespace+"."+ "selectById";
        return sqlSession.selectOne(sqlName,id);
    }

    public String getSqlName(String sqlName){
        return namespace+"."+sqlName;
    }






}
