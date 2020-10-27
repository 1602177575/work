package com.entity;

import java.math.BigDecimal;

public class OrdetItem {
    /**
     *
     */
    private Integer item_id;

    /**
     *
     */
    private Integer order_id;

    /**
     * 产品名
     */
    private String product_name;

    /**
     * 图片
     */
    private String product_img;

    /**
     * 价格
     */
    private BigDecimal product_price;

    /**
     * 数量
     */
    private Integer product_quantity;

    /**
     *
     */
    private Integer order_no;

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public BigDecimal getProduct_price() {
        return product_price;
    }

    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(Integer product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Integer getOrder_no() {
        return order_no;
    }

    public void setOrder_no(Integer order_no) {
        this.order_no = order_no;
    }

    @Override
    public String toString() {
        return "OrdetItem{" +
                "item_id=" + item_id +
                ", order_id=" + order_id +
                ", product_name='" + product_name + '\'' +
                ", product_img='" + product_img + '\'' +
                ", product_price=" + product_price +
                ", product_quantity=" + product_quantity +
                ", order_no=" + order_no +
                '}';
    }
}

