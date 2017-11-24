package com.tianyalei.testzuul.controller;

import com.tianyalei.testzuul.service.RefreshRouteService;
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

}
