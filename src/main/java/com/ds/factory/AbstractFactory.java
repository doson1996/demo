package com.ds.factory;

import com.ds.entity.Goods;

/**
 * 商品的抽象工厂
 * @author ds
 */
public abstract class AbstractFactory<T> {

    /**
     * 创建商品
     * @param c
     * @return 商品
     */
    public abstract Goods createGoods(Class<T> c);

}
