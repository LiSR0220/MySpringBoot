package com.example.lisr.service;

import com.example.lisr.dao.TestDao;
import com.example.lisr.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}