package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * Created by plough on 2018/10/22.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
	 * @param userPhone
     * @return int，插入的行数
     * @date 2018/10/22 3:39 PM
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * 根据 id 查询 SuccessKilled 并携带秒杀产品对象实体
     * @param seckillId
     * @return org.seckill.entity.SuccessKilled
     * @date 2018/10/22 3:40 PM
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
