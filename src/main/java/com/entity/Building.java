package com.entity;

public class Building {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 编号
     */
    private Integer num;

    /**
     * 建筑面积
     */
    private Double area;

    /**
     * 楼栋ID
     */
    private String buildingID;

    /**
     * 创建员工
     */
    private String employee;

    /**
     * 判断是否激活状态
     */
    private Integer isdelte;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(String buildingID) {
        this.buildingID = buildingID;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Integer getIsdelte() {
        return isdelte;
    }

    public void setIsdelte(Integer isdelte) {
        this.isdelte = isdelte;
    }
}

