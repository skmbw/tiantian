package com.vteba.tiantian.user.model;

public class Address {
    /**
     * order by 排序语句
     * 对应数据库表字段 address
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 address
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 address
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 address
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 address.address_id
     */
    private String addressId;

    /**
     * 对应数据库表字段 address.user_id
     */
    private String userId;

    /**
     * 对应数据库表字段 address.user_account
     */
    private String userAccount;

    /**
     * 对应数据库表字段 address.province
     */
    private String province;

    /**
     * 对应数据库表字段 address.city
     */
    private String city;

    /**
     * 对应数据库表字段 address.district
     */
    private String district;

    /**
     * 对应数据库表字段 address.street
     */
    private String street;

    /**
     * 对应数据库表字段 address.zipcode
     */
    private String zipcode;

    /**
     * 对应数据库表字段 address.address
     */
    private String address;

    /**
     * 对应数据库表字段 address.enabled
     */
    private Integer enabled;

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
     * 获得字段 address.address_id 的值
     *
     * @return the value of address.address_id
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * 设置字段 address.address_id 的值
     *
     * @param addressId the value for address.address_id
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * 获得字段 address.user_id 的值
     *
     * @return the value of address.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置字段 address.user_id 的值
     *
     * @param userId the value for address.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获得字段 address.user_account 的值
     *
     * @return the value of address.user_account
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置字段 address.user_account 的值
     *
     * @param userAccount the value for address.user_account
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获得字段 address.province 的值
     *
     * @return the value of address.province
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置字段 address.province 的值
     *
     * @param province the value for address.province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获得字段 address.city 的值
     *
     * @return the value of address.city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置字段 address.city 的值
     *
     * @param city the value for address.city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获得字段 address.district 的值
     *
     * @return the value of address.district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置字段 address.district 的值
     *
     * @param district the value for address.district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获得字段 address.street 的值
     *
     * @return the value of address.street
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置字段 address.street 的值
     *
     * @param street the value for address.street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 获得字段 address.zipcode 的值
     *
     * @return the value of address.zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 设置字段 address.zipcode 的值
     *
     * @param zipcode the value for address.zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * 获得字段 address.address 的值
     *
     * @return the value of address.address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置字段 address.address 的值
     *
     * @param address the value for address.address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获得字段 address.enabled 的值
     *
     * @return the value of address.enabled
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 设置字段 address.enabled 的值
     *
     * @param enabled the value for address.enabled
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}