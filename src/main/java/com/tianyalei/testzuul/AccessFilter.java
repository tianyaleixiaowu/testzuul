package com.tianyalei.testzuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.tianyalei.testzuul.service.RefreshRouteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class AccessFilter extends ZuulFilter {
    @Autowired
    RefreshRouteService refreshRouteService;

    private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());

        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null) {
            log.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            print("access token is empty");
            return null;
        }

        log.info("access token ok");
        return null;
    }


    private void print(String s) {
        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
        response.setContentType("text/html; charset=utf-8");
        try {
            PrintWriter out = response.getWriter();
            out.print(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

