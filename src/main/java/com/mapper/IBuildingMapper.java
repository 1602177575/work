package com.mapper;

import com.entity.Building;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBuildingMapper {

    /**
     * 添加楼层
     * @param building
     * @return
     */
    Integer inserBuilding(@Param("building") Building building);

    /**
     * 删除楼
     * @param id
     * @return
     */
    Integer DeleteBuiding(@Param("did") Integer id);

    /**
     * 修改楼层信息
     * @param building
     * @return
     */
    Integer UpDateBuilding(@Param("UpBuilding") Building building);

    /**
     * 查询所有楼层
     * @return
     */
    List<Building> SelectAllBuilding();

    /**
     * 根据楼层ID查询
     * @param id
     * @return
     */
    Building SelectByBId(@Param("sid") Integer id);


    /**
     * 根据楼栋编号查找
     * @param num
     * @return
     */
    Building SelectByNum(@Param("nid") Integer num);

    /**
     * 根单元名字查询
     * @param name
     * @return
     */
    Building SelectByName(@Param("name") String name);
}
