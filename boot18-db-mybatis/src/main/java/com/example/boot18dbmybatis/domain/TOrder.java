package com.example.boot18dbmybatis.domain;

import lombok.Data;

import java.math.BigDecimal;

//TOrder映射表t_order
@Data
public class TOrder {
    //属性名称和表中列表一致
    private String id;
    private String code;
    private Integer stock;
    private BigDecimal money;
}
