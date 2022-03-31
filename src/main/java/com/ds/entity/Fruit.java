package com.ds.entity;

/**
 * 水果
 *
 * @author ds
 * @date 2022/3/31 23:32
 */
public class Fruit {

    /**
     * 水果名称
     */
    private String name;

    /**
     * 水果单价（单位/分）
     */
    private Integer price;

    public Fruit() {
    }

    public Fruit(String name, Integer price) {
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
