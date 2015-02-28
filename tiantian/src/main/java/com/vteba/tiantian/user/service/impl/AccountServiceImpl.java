package com.vteba.tiantian.user.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.vteba.tiantian.user.dao.AccountDao;
import com.vteba.tiantian.user.model.Account;
import com.vteba.tiantian.user.model.AccountBean;
import com.vteba.tiantian.user.service.spi.AccountService;

/**
 * 我的账户相关的service业务实现。
 * @author yinlei
 * @date 2015-2-28 17:35:22
 */
@Named
public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountDao accountDao;

	@Override
	public int count(AccountBean params) {
		return accountDao.count(params);
	}

	@Override
	public int deleteBatch(AccountBean params) {
		return accountDao.deleteBatch(params);
	}

	@Override
	public int deleteById(String id) {
		return accountDao.deleteById(id);
	}

	@Override
	public int save(Account record) {
		return accountDao.save(record);
	}

	@Override
	public List<Account> queryForList(AccountBean params) {
		return accountDao.queryForList(params);
	}

	@Override
	public Account get(String id) {
		return accountDao.get(id);
	}
	
	@Override
	public Account unique(Account params) {
		return accountDao.unique(params);
	}

	@Override
	public int updateBatch(Account record, AccountBean params) {
		return accountDao.updateBatch(record, params);
	}

	@Override
	public int updateById(Account record) {
		return accountDao.updateById(record);
	}

    @Override
    public int countBy(Account params) {
        return accountDao.countBy(params);
    }

    @Override
    public int deleteBulks(Account params) {
        return accountDao.deleteBulks(params);
    }

    @Override
    public List<Account> queryList(Account params) {
        return accountDao.queryList(params);
    }

    @Override
    public List<Account> pagedForList(AccountBean params) {
        return accountDao.pagedForList(params);
    }

    @Override
    public List<Account> pagedList(Account params) {
        return accountDao.pagedList(params);
    }

    @Override
    public int updateBulks(Account record, Account params) {
        return accountDao.updateBulks(record, params);
    }

}
