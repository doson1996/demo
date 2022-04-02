package com.ds.factory;

import com.ds.entity.Fruit;

/**
 * 创建水果类工厂
 * @author ds
 */
public class FruitFactory extends AbstractFactory {

    @Override
    public Fruit createGoods(Class c) {
        Fruit fruit = null;
        try {
            fruit = (Fruit)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {

        }

        return fruit;
    }
}
