package com.ds.service.impl;

import com.ds.entity.Fruit;
import com.ds.entity.ShoppingCart;
import com.ds.entity.Supermarket;
import com.ds.service.BuyService;
import com.ds.price.PriceCalculation;

import java.util.Map;
import java.util.Objects;

/**
 * @author ds
 * @date 2022/4/1 0:01
 */
public class BuyServiceImpl implements BuyService {

    @Override
    public ShoppingCart buy(ShoppingCart shoppingCart, Supermarket supermarket) {
        //参数校验
        if (Objects.isNull(shoppingCart) || Objects.isNull(supermarket)) {
            return new ShoppingCart();
        }

        Map<String, Fruit> sellGoods = supermarket.getSellGoods();
        Map<String, Integer> goods = shoppingCart.getGoods();
        //总价
        Integer totalPrice = PriceCalculation.calculateTotalPrice(goods, sellGoods);
        //优惠金额
        Integer discountedPrice = supermarket.getStrategy().discount(goods, sellGoods);

        shoppingCart.setTotalPrice(totalPrice);
        shoppingCart.setPayable(totalPrice - discountedPrice);
        shoppingCart.setDiscountedPrice(discountedPrice);

        return shoppingCart;
    }
}
