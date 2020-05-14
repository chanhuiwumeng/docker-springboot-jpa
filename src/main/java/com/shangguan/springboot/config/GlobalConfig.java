package com.shangguan.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName: GlobalConfig
 * @Description:
 * @Author: 一尘
 * @Date: 2020 年 05 月 14 14:40
 * @Version 1.0
 */
@Configuration
public class GlobalConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}
