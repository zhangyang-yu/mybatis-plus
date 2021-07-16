package com.zhangyang.mybatisplusproject.service;

import com.zhangyang.mybatisplusproject.entity.CpecBatchAcptInfoEntity;

import java.util.List;

public interface TestService {
   List<CpecBatchAcptInfoEntity> findCpecBatchAcptInfo();
   List<CpecBatchAcptInfoEntity> findOne(String id);
}
