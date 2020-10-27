package com.mapper;

import com.entity.TOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    /**
     * 查询订单
     *
     * @param no
     * @return
     */
    TOrder SelectOrderByNo(@Param("orderNo") Integer no);


    /**
     * 根据用户 查询订单
     *
     * @param uid
     * @return
     */
    List<TOrder> SelectOrderByUserId(@Param("userId") Integer uid);


}
