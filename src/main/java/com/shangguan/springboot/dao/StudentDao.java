package com.shangguan.springboot.dao;

import com.shangguan.springboot.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName: StudentDao
 * @Description:
 * @Author: 一尘
 * @Date: 2020 年 05 月 14 14:27
 * @Version 1.0
 */
public interface StudentDao extends JpaRepository<Student,Integer> {
}
