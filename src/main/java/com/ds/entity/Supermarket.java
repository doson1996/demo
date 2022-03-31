package com.ds.entity;

import java.util.Map;

/**
 * 超市
 *
 * @author ds
 * @date 2022/3/31 23:29
 */
public class Supermarket {

    /**
     * 销售商品
     */
    private Map<String, Fruit> sellGoods;

    public Supermarket() {
    }

    public Map<String, Fruit> getSellGoods() {
        return sellGoods;
    }

    public void setSellGoods(Map<String, Fruit> sellGoods) {
        this.sellGoods = sellGoods;
    }
}
