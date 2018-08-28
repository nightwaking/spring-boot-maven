package com.lxl.project;

import com.lxl.project.rs.session.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 路由拦截，验证token
 */
@Component
public class TokenCheckInterceptor extends HandlerInterceptorAdapter {
	@Autowired
	SessionUtils sessionUtils;

	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler)
			throws Exception{
		return true;
	}
}
