package com.ds.promotion;

import com.ds.constant.FruitName;
import com.ds.entity.Goods;

import java.util.Map;

/**
 * 促销活动策略一
 *    超市做促销活动，草莓限时打 8 折
 * @author ds
 */
public class PromotionStrategyA extends PromotionStrategy {

    @Override
    public Integer discount(Map<String, Integer> cartGoods, Map<String, Goods> sellGoods) {
        int discountedPrice = 0;
        for (String name : cartGoods.keySet()) {
            if (FruitName.STRAWBERRY.equals(name)) {
                Goods goods = sellGoods.get(FruitName.STRAWBERRY);
                discountedPrice += goods.getPrice() * cartGoods.get(name) * 2;
            }
        }

        return discountedPrice / 10;
    }
}
