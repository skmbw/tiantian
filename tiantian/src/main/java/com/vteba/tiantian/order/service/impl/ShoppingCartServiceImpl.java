package com.vteba.tiantian.order.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.tiantian.order.dao.ShoppingCartDao;
import com.vteba.tiantian.order.model.ShoppingCart;
import com.vteba.tiantian.order.model.ShoppingCartBean;
import com.vteba.tiantian.order.service.spi.ShoppingCartService;

/**
 * 购物车相关的service业务实现。
 * @author yinlei
 * @date 2015-3-2 15:12:18
 */
@Named
public class ShoppingCartServiceImpl implements ShoppingCartService {
	
	@Inject
	private ShoppingCartDao shoppingCartDao;

	@Override
	public int count(ShoppingCartBean params) {
		return shoppingCartDao.count(params);
	}

	@Override
	public int deleteBatch(ShoppingCartBean params) {
		return shoppingCartDao.deleteBatch(params);
	}

	@Override
	public int deleteById(String id) {
		return shoppingCartDao.deleteById(id);
	}

	@Override
	public int save(ShoppingCart record) {
		return shoppingCartDao.save(record);
	}

	@Override
	public List<ShoppingCart> queryForList(ShoppingCartBean params) {
		return shoppingCartDao.queryForList(params);
	}

	@Override
	public ShoppingCart get(String id) {
		return shoppingCartDao.get(id);
	}
	
	@Override
	public ShoppingCart unique(ShoppingCart params) {
		return shoppingCartDao.unique(params);
	}

	@Override
	public int updateBatch(ShoppingCart record, ShoppingCartBean params) {
		return shoppingCartDao.updateBatch(record, params);
	}

	@Override
	public int updateById(ShoppingCart record) {
		return shoppingCartDao.updateById(record);
	}

    @Override
    public int countBy(ShoppingCart params) {
        return shoppingCartDao.countBy(params);
    }

    @Override
    public int deleteBulks(ShoppingCart params) {
        return shoppingCartDao.deleteBulks(params);
    }

    @Override
    public List<ShoppingCart> queryList(ShoppingCart params) {
        return shoppingCartDao.queryList(params);
    }

    @Override
    public List<ShoppingCart> pagedForList(ShoppingCartBean params) {
        return shoppingCartDao.pagedForList(params);
    }

    @Override
    public List<ShoppingCart> pagedList(ShoppingCart params) {
        return shoppingCartDao.pagedList(params);
    }

    @Override
    public int updateBulks(ShoppingCart record, ShoppingCart params) {
        return shoppingCartDao.updateBulks(record, params);
    }

}
