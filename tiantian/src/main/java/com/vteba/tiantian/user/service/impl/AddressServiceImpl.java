package com.vteba.tiantian.user.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.tiantian.user.dao.AddressDao;
import com.vteba.tiantian.user.model.Address;
import com.vteba.tiantian.user.model.AddressBean;
import com.vteba.tiantian.user.service.spi.AddressService;

/**
 * 用户地址相关的service业务实现。
 * @author yinlei
 * @date 2015-3-2 15:19:20
 */
@Named
public class AddressServiceImpl implements AddressService {
	
	@Inject
	private AddressDao addressDao;

	@Override
	public int count(AddressBean params) {
		return addressDao.count(params);
	}

	@Override
	public int deleteBatch(AddressBean params) {
		return addressDao.deleteBatch(params);
	}

	@Override
	public int deleteById(String id) {
		return addressDao.deleteById(id);
	}

	@Override
	public int save(Address record) {
		return addressDao.save(record);
	}

	@Override
	public List<Address> queryForList(AddressBean params) {
		return addressDao.queryForList(params);
	}

	@Override
	public Address get(String id) {
		return addressDao.get(id);
	}
	
	@Override
	public Address unique(Address params) {
		return addressDao.unique(params);
	}

	@Override
	public int updateBatch(Address record, AddressBean params) {
		return addressDao.updateBatch(record, params);
	}

	@Override
	public int updateById(Address record) {
		return addressDao.updateById(record);
	}

    @Override
    public int countBy(Address params) {
        return addressDao.countBy(params);
    }

    @Override
    public int deleteBulks(Address params) {
        return addressDao.deleteBulks(params);
    }

    @Override
    public List<Address> queryList(Address params) {
        return addressDao.queryList(params);
    }

    @Override
    public List<Address> pagedForList(AddressBean params) {
        return addressDao.pagedForList(params);
    }

    @Override
    public List<Address> pagedList(Address params) {
        return addressDao.pagedList(params);
    }

    @Override
    public int updateBulks(Address record, Address params) {
        return addressDao.updateBulks(record, params);
    }

}
