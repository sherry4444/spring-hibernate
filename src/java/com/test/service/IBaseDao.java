package com.test.service;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/30.
 */
public interface IBaseDao<T, PK extends Serializable> {

    /**
     * 根据ID获取实体对象.
     *
     * @param id
     *            记录ID
     * @return 实体对象
     */
    public T get(PK id);

    /**
     * 保存实体对象.
     *
     * @param entity
     *            对象
     * @return ID
     */
    public PK save(T entity);
}