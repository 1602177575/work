package com.mapper;

import com.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserMapper {


    /**
     * 查询所有用户
     * @return
     */
    List<User> SelectByAll();

    /**
     * 根据ID查询ID
     * @param id
     * @return
     */
    User SelectById(@Param("id") Integer id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    Integer inserUser(@Param("user") User user);


    /**
     * 更新数据
     * @param user
     * @return
     */
    Integer UpDateUser(@Param("user")User user);



}
