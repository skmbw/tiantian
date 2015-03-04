package com.vteba.tiantian.order.model;

import java.util.Date;

public class Delivery {
    /**
     * order by 排序语句
     * 对应数据库表字段 delivery
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 delivery
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 delivery
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 delivery
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 delivery.delivery_id
     */
    private String deliveryId;

    /**
     * 对应数据库表字段 delivery.user_id
     */
    private String userId;

    /**
     * 对应数据库表字段 delivery.user_account
     */
    private String userAccount;

    /**
     * 对应数据库表字段 delivery.province
     */
    private String province;

    /**
     * 对应数据库表字段 delivery.city
     */
    private String city;

    /**
     * 对应数据库表字段 delivery.district
     */
    private String district;

    /**
     * 对应数据库表字段 delivery.street
     */
    private String street;

    /**
     * 对应数据库表字段 delivery.zipcode
     */
    private String zipcode;

    /**
     * 对应数据库表字段 delivery.address
     */
    private String address;

    /**
     * 对应数据库表字段 delivery.pay_type
     */
    private String payType;

    /**
     * 对应数据库表字段 delivery.delivery_date
     */
    private Date deliveryDate;

    /**
     * 对应数据库表字段 delivery.delivery_employee
     */
    private String deliveryEmployee;

    /**
     * 对应数据库表字段 delivery.employee_mobile
     */
    private String employeeMobile;

    /**
     * 设置 order by 排序语句
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获得 order by 排序语句
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置 start，分页开始记录
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置 pageSize，分页大小
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得 pageSize，分页大小
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置 distinct，是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获得 distinct，是否去重
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得字段 delivery.delivery_id 的值
     *
     * @return the value of delivery.delivery_id
     */
    public String getDeliveryId() {
        return deliveryId;
    }

    /**
     * 设置字段 delivery.delivery_id 的值
     *
     * @param deliveryId the value for delivery.delivery_id
     */
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    /**
     * 获得字段 delivery.user_id 的值
     *
     * @return the value of delivery.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置字段 delivery.user_id 的值
     *
     * @param userId the value for delivery.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获得字段 delivery.user_account 的值
     *
     * @return the value of delivery.user_account
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置字段 delivery.user_account 的值
     *
     * @param userAccount the value for delivery.user_account
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获得字段 delivery.province 的值
     *
     * @return the value of delivery.province
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置字段 delivery.province 的值
     *
     * @param province the value for delivery.province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获得字段 delivery.city 的值
     *
     * @return the value of delivery.city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置字段 delivery.city 的值
     *
     * @param city the value for delivery.city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获得字段 delivery.district 的值
     *
     * @return the value of delivery.district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置字段 delivery.district 的值
     *
     * @param district the value for delivery.district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获得字段 delivery.street 的值
     *
     * @return the value of delivery.street
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置字段 delivery.street 的值
     *
     * @param street the value for delivery.street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 获得字段 delivery.zipcode 的值
     *
     * @return the value of delivery.zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 设置字段 delivery.zipcode 的值
     *
     * @param zipcode the value for delivery.zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * 获得字段 delivery.address 的值
     *
     * @return the value of delivery.address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置字段 delivery.address 的值
     *
     * @param address the value for delivery.address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获得字段 delivery.pay_type 的值
     *
     * @return the value of delivery.pay_type
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置字段 delivery.pay_type 的值
     *
     * @param payType the value for delivery.pay_type
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 获得字段 delivery.delivery_date 的值
     *
     * @return the value of delivery.delivery_date
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * 设置字段 delivery.delivery_date 的值
     *
     * @param deliveryDate the value for delivery.delivery_date
     */
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    /**
     * 获得字段 delivery.delivery_employee 的值
     *
     * @return the value of delivery.delivery_employee
     */
    public String getDeliveryEmployee() {
        return deliveryEmployee;
    }

    /**
     * 设置字段 delivery.delivery_employee 的值
     *
     * @param deliveryEmployee the value for delivery.delivery_employee
     */
    public void setDeliveryEmployee(String deliveryEmployee) {
        this.deliveryEmployee = deliveryEmployee;
    }

    /**
     * 获得字段 delivery.employee_mobile 的值
     *
     * @return the value of delivery.employee_mobile
     */
    public String getEmployeeMobile() {
        return employeeMobile;
    }

    /**
     * 设置字段 delivery.employee_mobile 的值
     *
     * @param employeeMobile the value for delivery.employee_mobile
     */
    public void setEmployeeMobile(String employeeMobile) {
        this.employeeMobile = employeeMobile;
    }
}