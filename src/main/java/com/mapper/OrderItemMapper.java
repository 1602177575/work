package com.mapper;

import com.entity.OrdetItem;
import org.apache.ibatis.annotations.Param;

public interface OrderItemMapper {


    OrdetItem SelectTitemById(@Param("itemId") Integer id);

}
