package org.yunyisite.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Phoenix Filter
 * 
 * @author Administrator
 *
 */
public class MyFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("This is MyFilter init");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("This is MyFilter doFilter");
		chain.doFilter(request, response);
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("This is MyFilter destroy");
	}

}
