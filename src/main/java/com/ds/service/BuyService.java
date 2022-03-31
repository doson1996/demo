package com.ds.service;

import com.ds.entity.ShoppingCart;
import com.ds.entity.Supermarket;

/**
 * 购买
 * @author ds
 * @date 2022/3/31 23:59
 */
public interface BuyService {

    /**
     * 购买
     * @param shoppingCart 购物车信息
     * @param supermarket 超市信息
     * @return 购物结算信息
     */
    ShoppingCart buy(ShoppingCart shoppingCart, Supermarket supermarket);

}
