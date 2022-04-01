package com.ds.promotion;

import com.ds.constant.FruitName;
import com.ds.entity.Fruit;

import java.util.Map;

/**
 * 促销活动策略二
 *    促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块
 * @author ds
 */
public class PromotionStrategyB extends PromotionStrategy {

    @Override
    public Integer discount(Map<String, Integer> goods, Map<String, Fruit> sellGoods) {

        return 0;
    }
}
