package com.vteba.tiantian.order.model;

import java.util.Date;

public class ShoppingCart {
    /**
     * order by 排序语句
     * 对应数据库表字段 shopping_cart
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 shopping_cart
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 shopping_cart
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 shopping_cart
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 shopping_cart.item_id
     */
    private String itemId;

    /**
     * 对应数据库表字段 shopping_cart.item_name
     */
    private String itemName;

    /**
     * 对应数据库表字段 shopping_cart.item_color
     */
    private String itemColor;

    /**
     * 对应数据库表字段 shopping_cart.item_size
     */
    private String itemSize;

    /**
     * 对应数据库表字段 shopping_cart.item_desc
     */
    private String itemDesc;

    /**
     * 对应数据库表字段 shopping_cart.image_url
     */
    private String imageUrl;

    /**
     * 对应数据库表字段 shopping_cart.quantity
     */
    private Integer quantity;

    /**
     * 对应数据库表字段 shopping_cart.unit_price
     */
    private Double unitPrice;

    /**
     * 对应数据库表字段 shopping_cart.total
     */
    private Double total;

    /**
     * 对应数据库表字段 shopping_cart.ref_no
     */
    private String refNo;

    /**
     * 对应数据库表字段 shopping_cart.add_date
     */
    private Date addDate;

    /**
     * 对应数据库表字段 shopping_cart.user_id
     */
    private String userId;

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
     * 获得字段 shopping_cart.item_id 的值
     *
     * @return the value of shopping_cart.item_id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置字段 shopping_cart.item_id 的值
     *
     * @param itemId the value for shopping_cart.item_id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获得字段 shopping_cart.item_name 的值
     *
     * @return the value of shopping_cart.item_name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置字段 shopping_cart.item_name 的值
     *
     * @param itemName the value for shopping_cart.item_name
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获得字段 shopping_cart.item_color 的值
     *
     * @return the value of shopping_cart.item_color
     */
    public String getItemColor() {
        return itemColor;
    }

    /**
     * 设置字段 shopping_cart.item_color 的值
     *
     * @param itemColor the value for shopping_cart.item_color
     */
    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    /**
     * 获得字段 shopping_cart.item_size 的值
     *
     * @return the value of shopping_cart.item_size
     */
    public String getItemSize() {
        return itemSize;
    }

    /**
     * 设置字段 shopping_cart.item_size 的值
     *
     * @param itemSize the value for shopping_cart.item_size
     */
    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
    }

    /**
     * 获得字段 shopping_cart.item_desc 的值
     *
     * @return the value of shopping_cart.item_desc
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * 设置字段 shopping_cart.item_desc 的值
     *
     * @param itemDesc the value for shopping_cart.item_desc
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    /**
     * 获得字段 shopping_cart.image_url 的值
     *
     * @return the value of shopping_cart.image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 设置字段 shopping_cart.image_url 的值
     *
     * @param imageUrl the value for shopping_cart.image_url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 获得字段 shopping_cart.quantity 的值
     *
     * @return the value of shopping_cart.quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置字段 shopping_cart.quantity 的值
     *
     * @param quantity the value for shopping_cart.quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获得字段 shopping_cart.unit_price 的值
     *
     * @return the value of shopping_cart.unit_price
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * 设置字段 shopping_cart.unit_price 的值
     *
     * @param unitPrice the value for shopping_cart.unit_price
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 获得字段 shopping_cart.total 的值
     *
     * @return the value of shopping_cart.total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * 设置字段 shopping_cart.total 的值
     *
     * @param total the value for shopping_cart.total
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * 获得字段 shopping_cart.ref_no 的值
     *
     * @return the value of shopping_cart.ref_no
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * 设置字段 shopping_cart.ref_no 的值
     *
     * @param refNo the value for shopping_cart.ref_no
     */
    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    /**
     * 获得字段 shopping_cart.add_date 的值
     *
     * @return the value of shopping_cart.add_date
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * 设置字段 shopping_cart.add_date 的值
     *
     * @param addDate the value for shopping_cart.add_date
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    /**
     * 获得字段 shopping_cart.user_id 的值
     *
     * @return the value of shopping_cart.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置字段 shopping_cart.user_id 的值
     *
     * @param userId the value for shopping_cart.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}