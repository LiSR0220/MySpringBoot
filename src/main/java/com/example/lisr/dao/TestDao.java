package com.example.lisr.dao;

import com.example.lisr.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(Integer id);
}