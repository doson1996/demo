package com.ds.promotion;

import com.ds.entity.Fruit;

import java.util.Map;

/**
 * 没有促销活动
 * @author ds
 */
public class PromotionStrategyNone extends PromotionStrategy {

    @Override
    public Integer discount(Map<String, Integer> goods, Map<String, Fruit> sellGoods) {
        return 0;
    }

}
