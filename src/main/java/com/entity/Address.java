package com.entity;

public class Address {
    /**
     *
     */
    private Integer id;

    /**
     *  用户ID
     */
    private Integer u_id;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 0则存在 1则删除
     */
    private Integer is_del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIs_del() {
        return is_del;
    }

    public void setIs_del(Integer is_del) {
        this.is_del = is_del;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", u_id=" + u_id +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", is_del=" + is_del +
                '}';
    }
}

