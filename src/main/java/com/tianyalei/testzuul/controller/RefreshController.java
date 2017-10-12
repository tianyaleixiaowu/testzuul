package com.tianyalei.testzuul.controller;

import com.tianyalei.testzuul.service.RefreshRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuweifeng on 2017/10/12.
 */
@RestController
public class RefreshController {
    @Autowired
    RefreshRouteService refreshRouteService;

    @RequestMapping("/refresh")
    public String refresh() {
        refreshRouteService.refreshRoute();
        return "refresh success";
    }
}
