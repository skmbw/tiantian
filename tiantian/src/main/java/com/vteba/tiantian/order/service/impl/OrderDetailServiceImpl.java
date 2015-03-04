package com.vteba.tiantian.order.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.tiantian.order.dao.OrderDetailDao;
import com.vteba.tiantian.order.model.OrderDetail;
import com.vteba.tiantian.order.model.OrderDetailBean;
import com.vteba.tiantian.order.service.spi.OrderDetailService;

/**
 * 订单明细相关的service业务实现。
 * @author yinlei
 * @date 2015-3-2 15:12:18
 */
@Named
public class OrderDetailServiceImpl implements OrderDetailService {
	
	@Inject
	private OrderDetailDao orderDetailDao;

	@Override
	public int count(OrderDetailBean params) {
		return orderDetailDao.count(params);
	}

	@Override
	public int deleteBatch(OrderDetailBean params) {
		return orderDetailDao.deleteBatch(params);
	}

	@Override
	public int deleteById(String id) {
		return orderDetailDao.deleteById(id);
	}

	@Override
	public int save(OrderDetail record) {
		return orderDetailDao.save(record);
	}

	@Override
	public List<OrderDetail> queryForList(OrderDetailBean params) {
		return orderDetailDao.queryForList(params);
	}

	@Override
	public OrderDetail get(String id) {
		return orderDetailDao.get(id);
	}
	
	@Override
	public OrderDetail unique(OrderDetail params) {
		return orderDetailDao.unique(params);
	}

	@Override
	public int updateBatch(OrderDetail record, OrderDetailBean params) {
		return orderDetailDao.updateBatch(record, params);
	}

	@Override
	public int updateById(OrderDetail record) {
		return orderDetailDao.updateById(record);
	}

    @Override
    public int countBy(OrderDetail params) {
        return orderDetailDao.countBy(params);
    }

    @Override
    public int deleteBulks(OrderDetail params) {
        return orderDetailDao.deleteBulks(params);
    }

    @Override
    public List<OrderDetail> queryList(OrderDetail params) {
        return orderDetailDao.queryList(params);
    }

    @Override
    public List<OrderDetail> pagedForList(OrderDetailBean params) {
        return orderDetailDao.pagedForList(params);
    }

    @Override
    public List<OrderDetail> pagedList(OrderDetail params) {
        return orderDetailDao.pagedList(params);
    }

    @Override
    public int updateBulks(OrderDetail record, OrderDetail params) {
        return orderDetailDao.updateBulks(record, params);
    }

}
