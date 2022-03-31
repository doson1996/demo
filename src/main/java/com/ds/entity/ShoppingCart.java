package com.ds.entity;



import com.ds.constant.MonetaryUnit;

import java.util.Map;

/**
 * 购物车
 * @author ds
 * @date 2022/3/31 23:45
 */
public class ShoppingCart {

    /**
     * 购买商品
     * Map<String-水果名称,Integer-数量>
     */
    private Map<String,Integer> goods;

    /**
     * 应付款（单位/分）
     */
    private Integer payable;

    /**
     * 实付款（单位/分）
     */
    private Integer actualPayment;

    /**
     * 优惠金额（单位/分）
     */
    private Integer discountedPrice;

    public ShoppingCart() {
    }

    public Map<String, Integer> getGoods() {
        return goods;
    }

    public void setGoods(Map<String, Integer> goods) {
        this.goods = goods;
    }

    public Integer getPayable() {
        return payable;
    }

    public void setPayable(Integer payable) {
        this.payable = payable;
    }

    public Integer getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Integer actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Integer getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(Integer discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "goods=" + goods +
                ", 应付款 = " + convert(payable) +
                ", 实付款 = " + convert(actualPayment) +
                ", 优惠金额 = " + convert(discountedPrice) +
                '}';
    }

    private String convert(Integer price) {
        String result = "￥" + (price / MonetaryUnit.YUAN) + "." ;
        if (price % MonetaryUnit.YUAN >= 10) {
           return result + (price % MonetaryUnit.YUAN);
        }
        return  result + (price % MonetaryUnit.YUAN) + "0";
    }
}
