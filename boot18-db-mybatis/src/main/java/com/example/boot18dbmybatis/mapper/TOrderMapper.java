package com.example.boot18dbmybatis.mapper;

import com.example.boot18dbmybatis.domain.TOrder;

public interface TOrderMapper {

    //定义操作数据的方法
    //插入
    int insertOrder(TOrder order);
    //查询
    TOrder selectOrderbyif(String id);
}
