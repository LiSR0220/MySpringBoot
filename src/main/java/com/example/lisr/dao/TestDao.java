package com.example.lisr.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.lisr.entity.TestEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TestDao extends BaseMapper<TestEntity> {
    @Select("SELECT * FROM `test` WHERE id = #{id};")
    TestEntity getById(@Param("id") Integer id);
}