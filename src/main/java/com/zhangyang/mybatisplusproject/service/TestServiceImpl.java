package com.zhangyang.mybatisplusproject.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhangyang.mybatisplusproject.entity.CpecBatchAcptInfoEntity;
import com.zhangyang.mybatisplusproject.mapper.CpecBatchAcptInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements  TestService {
    @Autowired
    private CpecBatchAcptInfoMapper cpecBatchAcptInfoMapper;
    @Override
    public List<CpecBatchAcptInfoEntity> findCpecBatchAcptInfo() {
        QueryWrapper<CpecBatchAcptInfoEntity> queryWrapper=new QueryWrapper<>();
        queryWrapper.last("limit 10");
        return cpecBatchAcptInfoMapper.selectList(queryWrapper);
    }

    @Override
    public List<CpecBatchAcptInfoEntity> findOne(String id) {

        return cpecBatchAcptInfoMapper.findOne(id);
    }

}
