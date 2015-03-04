package com.vteba.tiantian.item.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.tiantian.item.dao.ItemDao;
import com.vteba.tiantian.item.model.Item;
import com.vteba.tiantian.item.model.ItemBean;
import com.vteba.tiantian.item.service.spi.ItemService;

/**
 * 商品相关的service业务实现。
 * @author yinlei
 * @date 2015-3-2 15:20:58
 */
@Named
public class ItemServiceImpl implements ItemService {
	
	@Inject
	private ItemDao itemDao;

	@Override
	public int count(ItemBean params) {
		return itemDao.count(params);
	}

	@Override
	public int deleteBatch(ItemBean params) {
		return itemDao.deleteBatch(params);
	}

	@Override
	public int deleteById(String id) {
		return itemDao.deleteById(id);
	}

	@Override
	public int save(Item record) {
		return itemDao.save(record);
	}

	@Override
	public List<Item> queryForList(ItemBean params) {
		return itemDao.queryForList(params);
	}

	@Override
	public Item get(String id) {
		return itemDao.get(id);
	}
	
	@Override
	public Item unique(Item params) {
		return itemDao.unique(params);
	}

	@Override
	public int updateBatch(Item record, ItemBean params) {
		return itemDao.updateBatch(record, params);
	}

	@Override
	public int updateById(Item record) {
		return itemDao.updateById(record);
	}

    @Override
    public int countBy(Item params) {
        return itemDao.countBy(params);
    }

    @Override
    public int deleteBulks(Item params) {
        return itemDao.deleteBulks(params);
    }

    @Override
    public List<Item> queryList(Item params) {
        return itemDao.queryList(params);
    }

    @Override
    public List<Item> pagedForList(ItemBean params) {
        return itemDao.pagedForList(params);
    }

    @Override
    public List<Item> pagedList(Item params) {
        return itemDao.pagedList(params);
    }

    @Override
    public int updateBulks(Item record, Item params) {
        return itemDao.updateBulks(record, params);
    }

}
