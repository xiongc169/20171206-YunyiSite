package org.yoong.web.interceptor.phoenix;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class MyWebRequestInterceptor implements WebRequestInterceptor {

	public void preHandle(WebRequest request) throws Exception {

		System.out.println("This is MyWebRequestInterceptor preHandle");
	}

	public void postHandle(WebRequest request, ModelMap model) throws Exception {

		System.out.println("This is MyWebRequestInterceptor postHandle");
	}

	public void afterCompletion(WebRequest request, Exception ex) throws Exception {

		System.out.println("This is MyWebRequestInterceptor afterCompletion");

	}

}
