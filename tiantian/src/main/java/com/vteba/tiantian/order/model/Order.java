package com.vteba.tiantian.order.model;

import java.util.Date;

public class Order {
    /**
     * order by 排序语句
     * 对应数据库表字段 order
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 order
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 order
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 order
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 order.order_id
     */
    private String orderId;

    /**
     * 对应数据库表字段 order.user_id
     */
    private Integer userId;

    /**
     * 对应数据库表字段 order.contract_id
     */
    private Long contractId;

    /**
     * 对应数据库表字段 order.remark
     */
    private String remark;

    /**
     * 对应数据库表字段 order.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 order.order_sum
     */
    private Double orderSum;

    /**
     * 对应数据库表字段 order.create_date
     */
    private Date createDate;

    /**
     * 对应数据库表字段 order.update_date
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
     * 获得字段 order.order_id 的值
     *
     * @return the value of order.order_id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置字段 order.order_id 的值
     *
     * @param orderId the value for order.order_id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获得字段 order.user_id 的值
     *
     * @return the value of order.user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置字段 order.user_id 的值
     *
     * @param userId the value for order.user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获得字段 order.contract_id 的值
     *
     * @return the value of order.contract_id
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * 设置字段 order.contract_id 的值
     *
     * @param contractId the value for order.contract_id
     */
    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    /**
     * 获得字段 order.remark 的值
     *
     * @return the value of order.remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置字段 order.remark 的值
     *
     * @param remark the value for order.remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获得字段 order.state 的值
     *
     * @return the value of order.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 order.state 的值
     *
     * @param state the value for order.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 order.order_sum 的值
     *
     * @return the value of order.order_sum
     */
    public Double getOrderSum() {
        return orderSum;
    }

    /**
     * 设置字段 order.order_sum 的值
     *
     * @param orderSum the value for order.order_sum
     */
    public void setOrderSum(Double orderSum) {
        this.orderSum = orderSum;
    }

    /**
     * 获得字段 order.create_date 的值
     *
     * @return the value of order.create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置字段 order.create_date 的值
     *
     * @param createDate the value for order.create_date
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获得字段 order.update_date 的值
     *
     * @return the value of order.update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置字段 order.update_date 的值
     *
     * @param updateDate the value for order.update_date
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}