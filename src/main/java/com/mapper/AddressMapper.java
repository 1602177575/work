package com.mapper;

import com.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {


    /**
     * 添加地址
     * @param address
     * @return
     */
    Integer inserAddress(@Param("add") Address address);


    /**
     * 删除地址
     * @param aid
     * @return
     */
    Integer DelectAddress(@Param("dad") Integer aid);


    /**
     * 修改地址信息
     * @param address
     * @return
     */
    Integer UpDateAddress(@Param("uad") Address address);


    /**
     * 查询该用户的所有地址
     * @param uid 用户ID
     * @return
     */
    List<Address> SelectAddress(@Param("s_uid") Integer uid);


}
