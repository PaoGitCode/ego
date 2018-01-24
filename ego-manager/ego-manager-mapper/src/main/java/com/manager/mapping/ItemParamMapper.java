package com.manager.mapping;

import com.manager.pojo.ItemParam;

public interface ItemParamMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemParam record);

    int insertSelective(ItemParam record);

    ItemParam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemParam record);

    int updateByPrimaryKeyWithBLOBs(ItemParam record);

    int updateByPrimaryKey(ItemParam record);
}