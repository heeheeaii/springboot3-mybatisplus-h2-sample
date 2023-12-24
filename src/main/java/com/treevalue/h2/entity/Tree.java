package com.treevalue.h2.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigInteger;

@Data
@TableName("trees")
public class Tree {
    @TableId
    private BigInteger id;
    private String name;
}
