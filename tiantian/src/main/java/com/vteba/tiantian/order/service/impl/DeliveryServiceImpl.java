package com.vteba.tiantian.order.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.tiantian.order.dao.DeliveryDao;
import com.vteba.tiantian.order.model.Delivery;
import com.vteba.tiantian.order.model.DeliveryBean;
import com.vteba.tiantian.order.service.spi.DeliveryService;

/**
 * 配送信息相关的service业务实现。
 * @author yinlei
 * @date 2015-3-2 15:12:18
 */
@Named
public class DeliveryServiceImpl implements DeliveryService {
	
	@Inject
	private DeliveryDao deliveryDao;

	@Override
	public int count(DeliveryBean params) {
		return deliveryDao.count(params);
	}

	@Override
	public int deleteBatch(DeliveryBean params) {
		return deliveryDao.deleteBatch(params);
	}

	@Override
	public int deleteById(String id) {
		return deliveryDao.deleteById(id);
	}

	@Override
	public int save(Delivery record) {
		return deliveryDao.save(record);
	}

	@Override
	public List<Delivery> queryForList(DeliveryBean params) {
		return deliveryDao.queryForList(params);
	}

	@Override
	public Delivery get(String id) {
		return deliveryDao.get(id);
	}
	
	@Override
	public Delivery unique(Delivery params) {
		return deliveryDao.unique(params);
	}

	@Override
	public int updateBatch(Delivery record, DeliveryBean params) {
		return deliveryDao.updateBatch(record, params);
	}

	@Override
	public int updateById(Delivery record) {
		return deliveryDao.updateById(record);
	}

    @Override
    public int countBy(Delivery params) {
        return deliveryDao.countBy(params);
    }

    @Override
    public int deleteBulks(Delivery params) {
        return deliveryDao.deleteBulks(params);
    }

    @Override
    public List<Delivery> queryList(Delivery params) {
        return deliveryDao.queryList(params);
    }

    @Override
    public List<Delivery> pagedForList(DeliveryBean params) {
        return deliveryDao.pagedForList(params);
    }

    @Override
    public List<Delivery> pagedList(Delivery params) {
        return deliveryDao.pagedList(params);
    }

    @Override
    public int updateBulks(Delivery record, Delivery params) {
        return deliveryDao.updateBulks(record, params);
    }

}
