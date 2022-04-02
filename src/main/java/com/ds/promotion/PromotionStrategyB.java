package com.ds.promotion;

import com.ds.constant.MonetaryUnit;
import com.ds.entity.Goods;
import com.ds.handler.PriceCalculation;

import java.util.Map;

/**
 * 促销活动策略二
 *    促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块
 *    满 100 减 10 块，100 和 10 可以作为参数带进来
 * @author ds
 */
public class PromotionStrategyB extends PromotionStrategyA {

    @Override
    public Integer discount(Map<String, Integer> cartGoods, Map<String, Goods> sellGoods) {
        // 商品总价
        Integer totalPrice = PriceCalculation.calculateTotalPrice(cartGoods, sellGoods);
        // 优惠活动一优惠金额
        Integer discountA = super.discount(cartGoods, sellGoods);
        // 享受满减次数
        Integer count = (totalPrice - discountA) / (100 * MonetaryUnit.YUAN);
        // 优惠活动二优惠金额
        Integer discountB = count * (10 * MonetaryUnit.YUAN);
        return discountA + discountB ;
    }
}
