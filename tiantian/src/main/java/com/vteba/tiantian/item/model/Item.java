package com.vteba.tiantian.item.model;

import java.util.Date;

public class Item {
    /**
     * order by 排序语句
     * 对应数据库表字段 item
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 item
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 item
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 item
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 item.item_id
     */
    private String itemId;

    /**
     * 对应数据库表字段 item.item_name
     */
    private String itemName;

    /**
     * 对应数据库表字段 item.item_price
     */
    private Double itemPrice;

    /**
     * 对应数据库表字段 item.discount_price
     */
    private Double discountPrice;

    /**
     * 对应数据库表字段 item.discount
     */
    private Double discount;

    /**
     * 对应数据库表字段 item.category_id
     */
    private Integer categoryId;

    /**
     * 对应数据库表字段 item.category_name
     */
    private String categoryName;

    /**
     * 对应数据库表字段 item.promotion
     */
    private String promotion;

    /**
     * 对应数据库表字段 item.brand
     */
    private String brand;

    /**
     * 对应数据库表字段 item.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 item.create_date
     */
    private Date createDate;

    /**
     * 对应数据库表字段 item.shelves_date
     */
    private Date shelvesDate;

    /**
     * 对应数据库表字段 item.create_user
     */
    private String createUser;

    /**
     * 对应数据库表字段 item.item_desc
     */
    private String itemDesc;

    /**
     * 对应数据库表字段 item.update_date
     */
    private Date updateDate;

    /**
     * 对应数据库表字段 item.item_number
     */
    private Integer itemNumber;

    /**
     * 对应数据库表字段 item.image_url
     */
    private String imageUrl;

    /**
     * 对应数据库表字段 item.target_url
     */
    private String targetUrl;

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
     * 获得字段 item.item_id 的值
     *
     * @return the value of item.item_id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置字段 item.item_id 的值
     *
     * @param itemId the value for item.item_id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获得字段 item.item_name 的值
     *
     * @return the value of item.item_name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置字段 item.item_name 的值
     *
     * @param itemName the value for item.item_name
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获得字段 item.item_price 的值
     *
     * @return the value of item.item_price
     */
    public Double getItemPrice() {
        return itemPrice;
    }

    /**
     * 设置字段 item.item_price 的值
     *
     * @param itemPrice the value for item.item_price
     */
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * 获得字段 item.discount_price 的值
     *
     * @return the value of item.discount_price
     */
    public Double getDiscountPrice() {
        return discountPrice;
    }

    /**
     * 设置字段 item.discount_price 的值
     *
     * @param discountPrice the value for item.discount_price
     */
    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * 获得字段 item.discount 的值
     *
     * @return the value of item.discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * 设置字段 item.discount 的值
     *
     * @param discount the value for item.discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * 获得字段 item.category_id 的值
     *
     * @return the value of item.category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * 设置字段 item.category_id 的值
     *
     * @param categoryId the value for item.category_id
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获得字段 item.category_name 的值
     *
     * @return the value of item.category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 设置字段 item.category_name 的值
     *
     * @param categoryName the value for item.category_name
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 获得字段 item.promotion 的值
     *
     * @return the value of item.promotion
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * 设置字段 item.promotion 的值
     *
     * @param promotion the value for item.promotion
     */
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    /**
     * 获得字段 item.brand 的值
     *
     * @return the value of item.brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置字段 item.brand 的值
     *
     * @param brand the value for item.brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获得字段 item.state 的值
     *
     * @return the value of item.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 item.state 的值
     *
     * @param state the value for item.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 item.create_date 的值
     *
     * @return the value of item.create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置字段 item.create_date 的值
     *
     * @param createDate the value for item.create_date
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获得字段 item.shelves_date 的值
     *
     * @return the value of item.shelves_date
     */
    public Date getShelvesDate() {
        return shelvesDate;
    }

    /**
     * 设置字段 item.shelves_date 的值
     *
     * @param shelvesDate the value for item.shelves_date
     */
    public void setShelvesDate(Date shelvesDate) {
        this.shelvesDate = shelvesDate;
    }

    /**
     * 获得字段 item.create_user 的值
     *
     * @return the value of item.create_user
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置字段 item.create_user 的值
     *
     * @param createUser the value for item.create_user
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获得字段 item.item_desc 的值
     *
     * @return the value of item.item_desc
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * 设置字段 item.item_desc 的值
     *
     * @param itemDesc the value for item.item_desc
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    /**
     * 获得字段 item.update_date 的值
     *
     * @return the value of item.update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置字段 item.update_date 的值
     *
     * @param updateDate the value for item.update_date
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获得字段 item.item_number 的值
     *
     * @return the value of item.item_number
     */
    public Integer getItemNumber() {
        return itemNumber;
    }

    /**
     * 设置字段 item.item_number 的值
     *
     * @param itemNumber the value for item.item_number
     */
    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     * 获得字段 item.image_url 的值
     *
     * @return the value of item.image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置字段 item.image_url 的值
     *
     * @param imageUrl the value for item.image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获得字段 item.target_url 的值
     *
     * @return the value of item.target_url
     */
    public String getTargetUrl() {
        return targetUrl;
    }

    /**
     * 设置字段 item.target_url 的值
     *
     * @param targetUrl the value for item.target_url
     */
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}