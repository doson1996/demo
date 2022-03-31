package com.ds.service.impl;

import com.ds.entity.Fruit;
import com.ds.entity.ShoppingCart;
import com.ds.entity.Supermarket;
import com.ds.service.BuyService;

import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * @author ds
 * @date 2022/4/1 0:01
 */
public class BuyServiceImpl implements BuyService {

     Logger log = Logger.getGlobal();

    @Override
    public ShoppingCart buy(ShoppingCart shoppingCart, Supermarket supermarket) {
        Map<String, Fruit> sellGoods = supermarket.getSellGoods();
        Map<String, Integer> goods = shoppingCart.getGoods();
        Integer payable = 0;
        Integer discountedPrice = 0;

        for (String name : goods.keySet()) {
            Fruit fruit = sellGoods.get(name);
            if (Objects.isNull(fruit)) {
                log.info("商品信息异常！");
            }
            //应付款
            payable += fruit.getPrice() * goods.get(name);

        }

        shoppingCart.setPayable(payable);
        shoppingCart.setActualPayment(payable - discountedPrice);
        shoppingCart.setDiscountedPrice(discountedPrice);
        return shoppingCart;
    }
}
