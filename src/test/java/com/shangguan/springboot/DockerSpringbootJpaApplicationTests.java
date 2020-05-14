package com.shangguan.springboot;

import com.shangguan.springboot.dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DockerSpringbootJpaApplicationTests {
    @Autowired
    StudentDao studentDao;

    @Test
    void queryAll() {
        System.out.println(studentDao.findAll());
    }

}
