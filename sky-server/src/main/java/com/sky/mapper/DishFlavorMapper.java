package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {


    /**
     * 插入菜单口味
     * @param flavors
     */
    void insertFlavor(List<DishFlavor> flavors);
}
