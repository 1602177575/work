package com;

import com.entity.Address;
import com.entity.Building;
import com.entity.TOrder;
import com.entity.User;
import com.mapper.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        //工厂模式
        // 构建者模式
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(
                Test.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        // 原生mybatis 默认为 false //
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
//
//        IBuildingMapper mapper1 = sqlSession.getMapper(IBuildingMapper.class);

  //    OrderMapper mapper2 = sqlSession.getMapper(OrderMapper.class);

//        List<User> list = mapper.SelectByAll();
//        list.forEach(lists->{
//            System.out.println(lists);
//        });
//
//        List<Building> all = mapper1.SelectAllBuilding();
//        all.forEach(user->{
//            System.out.println(user);
//        });
//        List<TOrder> tOrders = mapper2.SelectOrderByUserId(1);
//        System.out.println(tOrders);

        AddressMapper mapper = sqlSession.getMapper(AddressMapper.class);
        List<Address> addresses = mapper.SelectAddress(1);

        addresses.forEach(list->{
            System.out.println(list);
        });


    }
}
