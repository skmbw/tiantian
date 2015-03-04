package com.vteba.tiantian.order.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.tiantian.order.dao.OrderDao;
import com.vteba.tiantian.order.model.Order;
import com.vteba.tiantian.order.model.OrderBean;
import com.vteba.tiantian.order.service.spi.OrderService;

/**
 * 订单相关的service业务实现。
 * @author yinlei
 * @date 2015-3-2 15:12:18
 */
@Named
public class OrderServiceImpl implements OrderService {
	
	@Inject
	private OrderDao orderDao;

	@Override
	public int count(OrderBean params) {
		return orderDao.count(params);
	}

	@Override
	public int deleteBatch(OrderBean params) {
		return orderDao.deleteBatch(params);
	}

	@Override
	public int deleteById(String id) {
		return orderDao.deleteById(id);
	}

	@Override
	public int save(Order record) {
		return orderDao.save(record);
	}

	@Override
	public List<Order> queryForList(OrderBean params) {
		return orderDao.queryForList(params);
	}

	@Override
	public Order get(String id) {
		return orderDao.get(id);
	}
	
	@Override
	public Order unique(Order params) {
		return orderDao.unique(params);
	}

	@Override
	public int updateBatch(Order record, OrderBean params) {
		return orderDao.updateBatch(record, params);
	}

	@Override
	public int updateById(Order record) {
		return orderDao.updateById(record);
	}

    @Override
    public int countBy(Order params) {
        return orderDao.countBy(params);
    }

    @Override
    public int deleteBulks(Order params) {
        return orderDao.deleteBulks(params);
    }

    @Override
    public List<Order> queryList(Order params) {
        return orderDao.queryList(params);
    }

    @Override
    public List<Order> pagedForList(OrderBean params) {
        return orderDao.pagedForList(params);
    }

    @Override
    public List<Order> pagedList(Order params) {
        return orderDao.pagedList(params);
    }

    @Override
    public int updateBulks(Order record, Order params) {
        return orderDao.updateBulks(record, params);
    }

}
