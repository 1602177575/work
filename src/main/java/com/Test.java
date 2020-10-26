package com;

import com.entity.User;
import com.mapper.IUserMapper;
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

        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
         List<User> list = mapper.SelectByAll();
        System.out.println(list);
    }
}
