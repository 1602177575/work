package com.entity;

public class Roles {
    /**
     *
     */
    private Integer role_id;

    /**
     * 角色名字
     */
    private String role_name;

    /**
     *
     */
    private String decs;

    /**
     * 0表示未删除1表示删除
     */
    private Integer is_del;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }

    public Integer getIs_del() {
        return is_del;
    }

    public void setIs_del(Integer is_del) {
        this.is_del = is_del;
    }
}

