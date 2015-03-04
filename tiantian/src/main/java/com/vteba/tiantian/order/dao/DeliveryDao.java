package com.vteba.tiantian.order.dao;

import com.vteba.tiantian.order.model.Delivery;
import com.vteba.tiantian.order.model.DeliveryBean;
import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 表delivery的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-03-02 15:12:19
 */
@DaoMapper
public interface DeliveryDao {
    /**
     * 根据params所携带条件进行count计数。
     * @param params 查询条件
     */
    int count(DeliveryBean params);

    /**
     * 根据params所携带条件进行计数，条件是等于，且是and关系。
     * @param params 查询条件
     */
    int countBy(Delivery params);

    /**
     * 根据params所携带条件删除记录，适用于复杂条件。
     * @param params 查询条件
     */
    int deleteBatch(DeliveryBean params);

    /**
     * 根据params所携带条件删除数据，条件是等于，且是and关系。
     * @param params 删除条件
     */
    int deleteBulks(Delivery params);

    /**
     * 根据主键删除记录。
     * @param id 主键id
     */
    int deleteById(String deliveryId);

    /**
     * 插入记录，只有非空字段才会插入到数据库。
     * @param record 要被保存的数据
     */
    int save(Delivery record);

    /**
     * 根据params所携带条件查询数据，适用于复杂查询。
     * @param params 查询条件
     */
    List<Delivery> queryForList(DeliveryBean params);

    /**
     * 根据params所携带条件查询数据，条件是等于，且是and关系。
     * @param params 查询条件
     */
    List<Delivery> queryList(Delivery params);

    /**
     * 根据params所携带条件分页查询数据，适用于复杂查询。
     * @param params 查询条件
     */
    List<Delivery> pagedForList(DeliveryBean params);

    /**
     * 根据params所携带条件分页查询数据，条件是等于，且是and关系。
     * @param params 查询条件
     */
    List<Delivery> pagedList(Delivery params);

    /**
     * 根据主键查询数据。
     * @param id 主键
     */
    Delivery get(String deliveryId);

    /**
     * 根据params所携带条件查询唯一记录，条件是等于，且是and关系。
     * @param params 查询条件
     */
    Delivery unique(Delivery params);

    /**
     * 根据params所携带条件更新指定字段，适用于复杂条件。
     * @param record 要更新的数据
     * @param params update的where条件
     */
    int updateBatch(@Param("record") Delivery record, @Param("params") DeliveryBean params);

    /**
     * 根据params所携带条件更新指定字段，条件是等于，且是and关系。
     * @param record 要更新的数据
     * @param params update的where条件
     */
    int updateBulks(@Param("record") Delivery record, @Param("params") Delivery params);

    /**
     * 根据主键更新指定字段的数据。
     * @param record 要更新的数据，含有Id
     */
    int updateById(Delivery record);
}