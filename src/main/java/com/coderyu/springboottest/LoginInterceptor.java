package com.coderyu.springboottest;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        //登录页面放行
        String requestUri=uri.toLowerCase();
        String[] openUriList=new String[]{"/login","/webjars","/images","/css"};
        for (String openUri:openUriList ) {
            if(requestUri.startsWith(openUri)){
                return true;
            }
        }

        if (request.getSession().getAttribute("user") != null) {
            return true;
        }else{
            response.sendRedirect(request.getContextPath()+"/login");
            return false;
        }
    }
}
