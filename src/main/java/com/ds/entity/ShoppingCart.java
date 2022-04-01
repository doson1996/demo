package com.ds.entity;

import com.ds.util.PriceConvertUtil;

import java.util.Map;

/**
 * 购物车
 * @author ds
 * @date 2022/3/31 23:45
 */
public class ShoppingCart {

    /**
     * 购物车商品信息
     * Map<String-水果名称,Integer-数量>
     */
    private Map<String,Integer> cartGoods;

    /**
     * 总价（单位/分）
     */
    private Integer totalPrice;

    /**
     * 应付款（单位/分）
     */
    private Integer payable;

    /**
     * 优惠金额（单位/分）
     */
    private Integer discountedPrice;

    public ShoppingCart() {
    }

    public Map<String, Integer> getCartGoods() {
        return cartGoods;
    }

    public void setCartGoods(Map<String, Integer> cartGoods) {
        this.cartGoods = cartGoods;
    }

    public Integer getPayable() {
        return payable;
    }

    public void setPayable(Integer payable) {
        this.payable = payable;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(Integer discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString() {
        return "购物车信息 {" +
                "商品 = " + cartGoods +
                ", 总价 = " + PriceConvertUtil.convertRMB(totalPrice) +
                ", 应付款 = " + PriceConvertUtil.convertRMB(payable) +
                ", 优惠金额 = " + PriceConvertUtil.convertRMB(discountedPrice) +
                '}';
    }

}
