package com.vteba.tiantian.user.model;

import java.util.Date;

public class Account {
    /**
     * order by 排序语句
     * 对应数据库表字段 account
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 account
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 account
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 account
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 account.id
     */
    private String id;

    /**
     * 对应数据库表字段 account.user_account
     */
    private String userAccount;

    /**
     * 对应数据库表字段 account.balance
     */
    private Double balance;

    /**
     * 对应数据库表字段 account.spend
     */
    private Double spend;

    /**
     * 对应数据库表字段 account.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 account.freeze
     */
    private Double freeze;

    /**
     * 对应数据库表字段 account.score
     */
    private Double score;

    /**
     * 对应数据库表字段 account.pay_password
     */
    private String payPassword;

    /**
     * 对应数据库表字段 account.enable_date
     */
    private Date enableDate;

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
     * 获得字段 account.id 的值
     *
     * @return the value of account.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 account.id 的值
     *
     * @param id the value for account.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 account.user_account 的值
     *
     * @return the value of account.user_account
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置字段 account.user_account 的值
     *
     * @param userAccount the value for account.user_account
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获得字段 account.balance 的值
     *
     * @return the value of account.balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置字段 account.balance 的值
     *
     * @param balance the value for account.balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 获得字段 account.spend 的值
     *
     * @return the value of account.spend
     */
    public Double getSpend() {
        return spend;
    }

    /**
     * 设置字段 account.spend 的值
     *
     * @param spend the value for account.spend
     */
    public void setSpend(Double spend) {
        this.spend = spend;
    }

    /**
     * 获得字段 account.state 的值
     *
     * @return the value of account.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 account.state 的值
     *
     * @param state the value for account.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 account.freeze 的值
     *
     * @return the value of account.freeze
     */
    public Double getFreeze() {
        return freeze;
    }

    /**
     * 设置字段 account.freeze 的值
     *
     * @param freeze the value for account.freeze
     */
    public void setFreeze(Double freeze) {
        this.freeze = freeze;
    }

    /**
     * 获得字段 account.score 的值
     *
     * @return the value of account.score
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置字段 account.score 的值
     *
     * @param score the value for account.score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 获得字段 account.pay_password 的值
     *
     * @return the value of account.pay_password
     */
    public String getPayPassword() {
        return payPassword;
    }

    /**
     * 设置字段 account.pay_password 的值
     *
     * @param payPassword the value for account.pay_password
     */
    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    /**
     * 获得字段 account.enable_date 的值
     *
     * @return the value of account.enable_date
     */
    public Date getEnableDate() {
        return enableDate;
    }

    /**
     * 设置字段 account.enable_date 的值
     *
     * @param enableDate the value for account.enable_date
     */
    public void setEnableDate(Date enableDate) {
        this.enableDate = enableDate;
    }
}