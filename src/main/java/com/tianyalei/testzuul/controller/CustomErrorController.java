package com.tianyalei.testzuul.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wuweifeng on 2017/10/12.
 */
@RestController
public class CustomErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping(value = "/error")
    public Object error(HttpServletResponse resp, HttpServletRequest req) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 404);
        map.put("message", "页面不存在");
        // 错误处理逻辑
        return map;
    }
}
