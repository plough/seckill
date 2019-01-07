package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by plough on 2018/10/22.
 */
public interface SeckillDao {

    /**
     * 减库存，
     * @param seckillId
     * @param killTime
     * @return int，如果影响行数 > 1，表示更新的记录行数
     * @date 2018/10/22 3:34 PM
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据 id 查询秒杀对象
     * @param seckillId
     * @return org.seckill.entity.Seckill
     * @date 2018/10/22 3:36 PM
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
	 * @param limit
     * @return java.util.List<org.seckill.entity.Seckill>
     * @date 2018/10/22 3:37 PM
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
