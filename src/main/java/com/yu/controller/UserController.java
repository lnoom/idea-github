package com.yu.controller;

import com.yu.pojo.User;
import com.yu.service.UserService;
import com.yu.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author zYu
 * @version 1.0
 * @create 2024-02-12 14:51
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/export")

    public void export(HttpServletResponse response) {
        List<User> userList = userService.findAll();

// 集合、标题、工作名、类对象、文件名、响应对象

        ExcelUtil.exportExcel(userList, "用户信息", "用户信息工作表", User.class, "user.xls", response);

    }
}
