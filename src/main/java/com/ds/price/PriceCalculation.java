package com.ds.price;

import com.ds.entity.Fruit;

import java.util.Map;
import java.util.Objects;

/**
 * 价格处理
 * @author ds
 */
public class PriceCalculation {

    /**
     *  计算总价
     * @param goods       购物车商品信息
     * @param sellGoods   销售商品信息
     * @return totalPrice 总价
     */
    public static Integer calculateTotalPrice(Map<String, Integer> goods, Map<String, Fruit> sellGoods) {
        //总价
        Integer totalPrice = 0;

        for (String name : goods.keySet()) {
            Fruit fruit = sellGoods.get(name);
            if (Objects.isNull(fruit)) {
                return 0;
            }
            totalPrice += fruit.getPrice() * goods.get(name);
        }

        return totalPrice;
    }

}
