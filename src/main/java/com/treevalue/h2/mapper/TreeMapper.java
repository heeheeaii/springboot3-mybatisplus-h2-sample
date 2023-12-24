package com.treevalue.h2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.treevalue.h2.entity.Tree;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TreeMapper extends BaseMapper<Tree> {
}
