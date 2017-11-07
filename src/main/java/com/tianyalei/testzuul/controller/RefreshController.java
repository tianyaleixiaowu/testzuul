package com.tianyalei.testzuul.controller;

import com.tianyalei.testzuul.service.RefreshRouteService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.web.ZuulHandlerMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by wuweifeng on 2017/10/12.
 */
@RestController
public class RefreshController {
    @Resource
    private RefreshRouteService refreshRouteService;
    @Resource
    private ZuulHandlerMapping zuulHandlerMapping;

    @Value("${server.port}")
    private String port;

    @GetMapping("/refreshRoute")
    public String refresh() {
        refreshRouteService.refreshRoute();
        return "refresh success";
    }

    @RequestMapping("/watchRoute")
    public Object watchNowRoute() {
        //可以用debug模式看里面具体是什么
        Map<String, Object> handlerMap = zuulHandlerMapping.getHandlerMap();
        return handlerMap;
    }

    @RequestMapping("/index")
    public Object index() {
        return port;
    }
}
