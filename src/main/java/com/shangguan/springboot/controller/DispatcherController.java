package com.shangguan.springboot.controller;

import com.shangguan.springboot.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: DispatcherController
 * @Description:
 * @Author: 一尘
 * @Date: 2020 年 05 月 14 14:42
 * @Version 1.0
 */
@Controller
public class DispatcherController {
    @Autowired
    StudentDao studentDao;
    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("list",studentDao.findAll());
        return "list"  ;
    }
}
