package com.entity;

import java.util.Date;

/**
 * 外键字段 使用唯一约束
 * 关系模式
 * 订单对应一个用户
 *
 */
public class TOrder {
    /**
     *
     */
    private Integer orderId;

    /**
     * 订单号
     */
    private Integer orderNo;

    /**
     * 创建时间
     */
    private Date create_date;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 0表示未支付1表示已支付
     */
    private Integer status;

    private User user;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "TOrder{" +
                "orderId=" + orderId +
                ", orderNo=" + orderNo +
                ", create_date=" + create_date +
                ", userId=" + userId +
                ", status=" + status +
                ", user=" + user +
                '}';
    }
}

