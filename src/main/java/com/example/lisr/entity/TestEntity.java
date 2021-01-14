package com.example.lisr.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//使用 Lombok 简化代码
@TableName("test")
@Data
public class TestEntity {

    protected Integer id ;

    protected String magicId ;

    protected String firstName ;

    protected String lastName ;
}
