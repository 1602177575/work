package com.service;

import com.entity.Address;

import java.util.List;

public interface UserService {

    /**
     * 添加地址
     * @param address
     * @return
     */
    Integer InserAddress(Address address);

    /**
     * 修改地址
     * @param address
     * @return
     */
    Integer UpDateAddress(Address address);

    /**
     * 删除地址
     * @param id
     * @return
     */
    Integer DelectAddress(Integer id);

    /**
     * 查询指定用户地址
     * @param uid
     * @return
     */
    List<Address> SelectAddress(Integer uid);

}
