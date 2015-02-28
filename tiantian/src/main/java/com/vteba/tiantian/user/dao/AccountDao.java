package com.vteba.tiantian.user.dao;

import com.vteba.tiantian.user.model.Account;
import com.vteba.tiantian.user.model.AccountBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 表account的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-02-28 17:35:24
 */
@DaoMapper
public interface AccountDao {
    /**
     * 根据params所携带条件进行count计数。
     * @param params 查询条件
     */
    int count(AccountBean params);

    /**
     * 根据params所携带条件进行计数，条件是等于，且是and关系。
     * @param params 查询条件
     */
    int countBy(Account params);

    /**
     * 根据params所携带条件删除记录，适用于复杂条件。
     * @param params 查询条件
     */
    int deleteBatch(AccountBean params);

    /**
     * 根据params所携带条件删除数据，条件是等于，且是and关系。
     * @param params 删除条件
     */
    int deleteBulks(Account params);

    /**
     * 根据主键删除记录。
     * @param id 主键id
     */
    int deleteById(String id);

    /**
     * 插入记录，只有非空字段才会插入到数据库。
     * @param record 要被保存的数据
     */
    int save(Account record);

    /**
     * 根据params所携带条件查询数据，适用于复杂查询。
     * @param params 查询条件
     */
    List<Account> queryForList(AccountBean params);

    /**
     * 根据params所携带条件查询数据，条件是等于，且是and关系。
     * @param params 查询条件
     */
    List<Account> queryList(Account params);

    /**
     * 根据params所携带条件分页查询数据，适用于复杂查询。
     * @param params 查询条件
     */
    List<Account> pagedForList(AccountBean params);

    /**
     * 根据params所携带条件分页查询数据，条件是等于，且是and关系。
     * @param params 查询条件
     */
    List<Account> pagedList(Account params);

    /**
     * 根据主键查询数据。
     * @param id 主键
     */
    Account get(String id);

    /**
     * 根据params所携带条件查询唯一记录，条件是等于，且是and关系。
     * @param params 查询条件
     */
    Account unique(Account params);

    /**
     * 根据params所携带条件更新指定字段，适用于复杂条件。
     * @param record 要更新的数据
     * @param params update的where条件
     */
    int updateBatch(@Param("record") Account record, @Param("params") AccountBean params);

    /**
     * 根据params所携带条件更新指定字段，条件是等于，且是and关系。
     * @param record 要更新的数据
     * @param params update的where条件
     */
    int updateBulks(@Param("record") Account record, @Param("params") Account params);

    /**
     * 根据主键更新指定字段的数据。
     * @param record 要更新的数据，含有Id
     */
    int updateById(Account record);
}