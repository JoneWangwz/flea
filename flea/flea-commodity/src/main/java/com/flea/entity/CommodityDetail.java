package com.flea.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Data
@TableName("test_table")
public class CommodityDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableField(value = "id")
    private int id;

    @TableField(value = "name")
    private String name;
}
