package com.entity;

public class Privilege {
    /**
     *
     */
    private Integer privilege_id;

    /**
     * 权限名
     */
    private String name;

    /**
     * 权限的说明
     */
    private String decs;

    /**
     * 0表示未删除1表示删除
     */
    private Integer is_del;

    public Integer getPrivilege_id() {
        return privilege_id;
    }

    public void setPrivilege_id(Integer privilege_id) {
        this.privilege_id = privilege_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

