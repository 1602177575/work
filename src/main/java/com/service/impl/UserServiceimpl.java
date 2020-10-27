package com.service.impl;

import com.entity.Address;
import com.mapper.AddressMapper;
import com.mysql.cj.Session;
import com.service.UserService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserServiceimpl implements UserService {
        AddressMapper addressMapper;

    UserServiceimpl(SqlSession sqlSession){
        addressMapper=sqlSession.getMapper(AddressMapper.class);
    }


    @Override
    public Integer InserAddress(Address address) {
        Integer integer = addressMapper.inserAddress(address);
        return integer;
    }

    @Override
    public Integer UpDateAddress(Address address) {
        Integer integer = addressMapper.UpDateAddress(address);
        return integer;
    }

    @Override
    public Integer DelectAddress(Integer id) {
        Integer integer = addressMapper.DelectAddress(id);
        return integer;
    }

    @Override
    public List<Address> SelectAddress(Integer uid) {
        List<Address> list = addressMapper.SelectAddress(uid);
        return list;
    }
}
