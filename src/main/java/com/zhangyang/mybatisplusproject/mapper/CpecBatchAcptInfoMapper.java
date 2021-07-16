package com.zhangyang.mybatisplusproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhangyang.mybatisplusproject.entity.CpecBatchAcptInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CpecBatchAcptInfoMapper extends BaseMapper<CpecBatchAcptInfoEntity> {
   public List<CpecBatchAcptInfoEntity> findOne(@Param("id") String id);
}
