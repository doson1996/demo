package com.ds.entity;

/**
 * 商品
 * @author ds
 */
public abstract class Goods {

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格（单位/分）
     */
    private Integer price;

    public Goods() {
    }

    public Goods(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
