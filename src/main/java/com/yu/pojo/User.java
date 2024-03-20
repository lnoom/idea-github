package com.yu.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ExcelTarget("UserVo")
public class User implements Serializable {
    private Integer id;
    @Excel(name="用户名", orderNum="0", type=1)
    private String name;
    @Excel(name="密码", orderNum="1", type=1)
    private String pwd;
}