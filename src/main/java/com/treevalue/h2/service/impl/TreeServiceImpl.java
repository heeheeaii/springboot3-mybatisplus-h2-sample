package com.treevalue.h2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.treevalue.h2.entity.Tree;
import com.treevalue.h2.mapper.TreeMapper;
import com.treevalue.h2.service.ITreeService;
import org.springframework.stereotype.Service;

@Service
public class TreeServiceImpl extends ServiceImpl<TreeMapper, Tree> implements ITreeService {
}
