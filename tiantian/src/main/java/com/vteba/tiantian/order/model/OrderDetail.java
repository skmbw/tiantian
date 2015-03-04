package com.vteba.tiantian.order.model;

import java.util.Date;

public class OrderDetail {
    /**
     * order by 排序语句
     * 对应数据库表字段 order_detail
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 order_detail
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 order_detail
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 order_detail
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 order_detail.order_detail_id
     */
    private String orderDetailId;

    /**
     * 对应数据库表字段 order_detail.order_id
     */
    private String orderId;

    /**
     * 对应数据库表字段 order_detail.user_id
     */
    private String userId;

    /**
     * 对应数据库表字段 order_detail.item_id
     */
    private String itemId;

    /**
     * 对应数据库表字段 order_detail.item_name
     */
    private String itemName;

    /**
     * 对应数据库表字段 order_detail.item_price
     */
    private Double itemPrice;

    /**
     * 对应数据库表字段 order_detail.remark
     */
    private String remark;

    /**
     * 对应数据库表字段 order_detail.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 order_detail.create_date
     */
    private Date createDate;

    /**
     * 对应数据库表字段 order_detail.update_date
     */
    private Date updateDate;

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
     * 获得字段 order_detail.order_detail_id 的值
     *
     * @return the value of order_detail.order_detail_id
     */
    public String getOrderDetailId() {
        return orderDetailId;
    }

    /**
     * 设置字段 order_detail.order_detail_id 的值
     *
     * @param orderDetailId the value for order_detail.order_detail_id
     */
    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    /**
     * 获得字段 order_detail.order_id 的值
     *
     * @return the value of order_detail.order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置字段 order_detail.order_id 的值
     *
     * @param orderId the value for order_detail.order_id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获得字段 order_detail.user_id 的值
     *
     * @return the value of order_detail.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置字段 order_detail.user_id 的值
     *
     * @param userId the value for order_detail.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获得字段 order_detail.item_id 的值
     *
     * @return the value of order_detail.item_id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置字段 order_detail.item_id 的值
     *
     * @param itemId the value for order_detail.item_id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获得字段 order_detail.item_name 的值
     *
     * @return the value of order_detail.item_name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置字段 order_detail.item_name 的值
     *
     * @param itemName the value for order_detail.item_name
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获得字段 order_detail.item_price 的值
     *
     * @return the value of order_detail.item_price
     */
    public Double getItemPrice() {
        return itemPrice;
    }

    /**
     * 设置字段 order_detail.item_price 的值
     *
     * @param itemPrice the value for order_detail.item_price
     */
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * 获得字段 order_detail.remark 的值
     *
     * @return the value of order_detail.remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置字段 order_detail.remark 的值
     *
     * @param remark the value for order_detail.remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获得字段 order_detail.state 的值
     *
     * @return the value of order_detail.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 order_detail.state 的值
     *
     * @param state the value for order_detail.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 order_detail.create_date 的值
     *
     * @return the value of order_detail.create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置字段 order_detail.create_date 的值
     *
     * @param createDate the value for order_detail.create_date
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获得字段 order_detail.update_date 的值
     *
     * @return the value of order_detail.update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置字段 order_detail.update_date 的值
     *
     * @param updateDate the value for order_detail.update_date
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}