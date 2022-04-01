package com.ds.entity;

import com.ds.promotion.PromotionStrategy;
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
     * Map<String-水果名称, Fruit-对应水果>
     */
    private Map<String, Goods> sellGoods;

    /**
     * 促销活动
     */
    private PromotionStrategy strategy;

    public Supermarket() {
    }

    public Map<String, Goods> getSellGoods() {
        return sellGoods;
    }

    public void setSellGoods(Map<String, Goods> sellGoods) {
        this.sellGoods = sellGoods;
    }

    public PromotionStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PromotionStrategy strategy) {
        this.strategy = strategy;
    }
}
