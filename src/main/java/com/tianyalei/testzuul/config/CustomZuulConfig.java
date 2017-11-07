package com.tianyalei.testzuul.config;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;

/**
 * Created by wuweifeng on 2017/10/12.
 */
@Configuration
public class CustomZuulConfig {

    @Resource
    private ZuulProperties zuulProperties;
    @Resource
    private ServerProperties server;
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Bean
    public CustomRouteLocator routeLocator() {
        CustomRouteLocator routeLocator = new CustomRouteLocator(this.server.getServletPrefix(), this.zuulProperties);
        routeLocator.setJdbcTemplate(jdbcTemplate);
        return routeLocator;
    }

}  
