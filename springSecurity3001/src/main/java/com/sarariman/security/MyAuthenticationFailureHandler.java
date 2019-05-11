package com.sarariman.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description cn.sm1234.security
 * @date 18/4/13
 */
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {
    //ObjectMapper: jackson框架的工具类，用于转换对象为json字符串
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        //返回json字符串给前端
        Map result = new HashMap();
        result.put("succcess",false);

        String json = objectMapper.writeValueAsString(result);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
}

