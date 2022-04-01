package com.ds.promotion;

import com.ds.entity.Goods;

import java.util.Map;

/**
 * 促销活动策略
 * @author ds
 */
public abstract class PromotionStrategy {

    /**
     * 优惠活动
     * @param cartGoods     购物车商品信息
     * @param sellGoods 销售商品信息
     * @return 优惠金额
     */
    public abstract Integer discount(Map<String, Integer> cartGoods, Map<String, Goods> sellGoods);

}
