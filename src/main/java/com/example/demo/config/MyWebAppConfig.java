package com.example.demo.config;

import com.example.demo.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/7/7
 * @ Description：config配置
 * @ throws
 */
@Configuration
public class MyWebAppConfig extends WebMvcConfigurationSupport {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截URL
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/sayHi");
        super.addInterceptors(registry);
    }

    //不拦截静态资源
    //http://localhost:8080/static/jm.jpg
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有/static/** 访问都映射到classpath:/static/ 目录下
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

}
