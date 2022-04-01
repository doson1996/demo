package com.ds.price;

import com.ds.entity.Goods;

import java.util.Map;
import java.util.Objects;

/**
 * 价格处理
 * @author ds
 */
public class PriceCalculation {

    /**
     *  计算总价
     * @param cartGoods       购物车商品信息
     * @param sellGoods   销售商品信息
     * @return totalPrice 总价
     */
    public static Integer calculateTotalPrice(Map<String, Integer> cartGoods, Map<String, Goods> sellGoods) {
        //总价
        Integer totalPrice = 0;

        for (String name : cartGoods.keySet()) {
            Goods goods = sellGoods.get(name);
            if (Objects.isNull(goods)) {
                return 0;
            }
            totalPrice += goods.getPrice() * cartGoods.get(name);
        }

        return totalPrice;
    }

}
