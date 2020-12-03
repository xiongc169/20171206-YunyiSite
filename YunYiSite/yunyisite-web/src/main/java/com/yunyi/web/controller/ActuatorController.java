package com.yunyi.web.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Objects;

/**
 * @Desc ActuatorController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2016年7月20日
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/actuator")
public class ActuatorController {

    /**
     * ServletContext，可以获取 Spring容器(父容器)、SpringMVC容器(子容器)
     */
    @Autowired
    private ServletContext servletContext;

    /**
     * SpringMVC容器(子容器)
     */
    @Autowired
    private WebApplicationContext servletWebApplicationContext01;

    /**
     * http://127.0.0.1:8090/actuator/getInitParameters
     */
    @ResponseBody
    @RequestMapping(path = "/getInitParameters", method = RequestMethod.GET)
    public String getInitParameters() {
        //获取web.xml中 <context-param>配置项 的值
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");//contextConfigLocation = classpath:spring.xml
        System.out.println(contextConfigLocation);
        Enumeration initParameterNames = servletContext.getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            Object initParameter = initParameterNames.nextElement();
            System.out.println(initParameter);
        }
        return "Success";
    }

    /**
     * http://127.0.0.1:8090/actuator/getIocContainer
     */
    @ResponseBody
    @RequestMapping(path = "/getIocContainer", method = RequestMethod.GET)
    public String getIocContainer(HttpServletRequest request, HttpServletResponse response) {
        //获取servletContext 所有的Attribute
        Enumeration attributeNames = servletContext.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            Object initParameter = attributeNames.nextElement();
            System.out.println(initParameter);
        }

        //1.1、获取 Spring容器(父容器=rootWac、parentWac)，key = org.springframework.web.context.WebApplicationContext.ROOT
        Object rootWebApplicationContext01 = servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        System.out.println(rootWebApplicationContext01);

        //1.2、获取 Spring容器(父容器=rootWac、parentWac)
        WebApplicationContext rootWebApplicationContext02 = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        System.out.println(rootWebApplicationContext02);

        //1.3、获取 Spring容器(父容器=rootWac、parentWac)
        ApplicationContext rootWebApplicationContext03 = servletWebApplicationContext01.getParent();

        //1.4、获取 Spring容器(父容器=rootWac、parentWac)
        WebApplicationContext rootWac04 = ContextLoader.getCurrentWebApplicationContext();
        //获取servletContext
        ServletContext servletContext02 = rootWac04.getServletContext();
        System.out.println(servletContext02);


        //2.1、获取 SpringMVC容器(子容器=servletWac、childWac)
        //注入 WebApplicationContext 类型的变量，即为 SpringMVC容器(子容器)

        //2.2、获取 SpringMVC容器(子容器=servletWac、childWac)
        Object servletWebApplicationContext02 = servletContext.getAttribute("org.springframework.web.servlet.FrameworkServlet.CONTEXT.dispatcherServlet");
        System.out.println(servletWebApplicationContext02);

        //2.3、获取 SpringMVC容器(子容器=servletWac、childWac)
        WebApplicationContext servletWebApplicationContext03 = WebApplicationContextUtils.getWebApplicationContext(servletContext, "org.springframework.web.servlet.FrameworkServlet.CONTEXT.dispatcherServlet");
        System.out.println(servletWebApplicationContext03);

        //2.4、获取 SpringMVC容器(子容器=servletWac、childWac)
        WebApplicationContext servletWebApplicationContext04 = RequestContextUtils.getWebApplicationContext(request);
        System.out.println(servletWebApplicationContext04);

        //2.5、获取 SpringMVC容器(子容器=servletWac、childWac)，DispatcherServlet.class.getName() = org.springframework.web.servlet.DispatcherServlet
        Object servletWebApplicationContext05 = request.getAttribute(DispatcherServlet.class.getName() + ".CONTEXT");
        System.out.println(servletWebApplicationContext05);

        String[] beanNames = servletWebApplicationContext01.getBeanDefinitionNames();
        String[] rootBeanNames = Objects.requireNonNull(rootWebApplicationContext03).getBeanDefinitionNames();
        //"linkedInAop",
        //"logAspect",
        //"phoenixAop",
        //"accountController",
        //"actuatorController",
        //"testController",
        //"consumerMessageListener",
        //"consumerSessionAwareMessageListener",
        //"producer",
        //"accountServiceImpl",
        //"customerServiceImpl",
        //"org.springframework.context.annotation.internalConfigurationAnnotationProcessor",
        //"org.springframework.context.annotation.internalAutowiredAnnotationProcessor",
        //"org.springframework.context.annotation.internalRequiredAnnotationProcessor",
        //"org.springframework.context.annotation.internalCommonAnnotationProcessor",
        //"org.springframework.context.event.internalEventListenerProcessor",
        //"org.springframework.context.event.internalEventListenerFactory",
        //"org.springframework.transaction.config.internalTransactionalEventListenerFactory",
        //"org.springframework.aop.config.internalAutoProxyCreator",
        //"org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#0",
        //"org.springframework.transaction.interceptor.TransactionInterceptor#0",
        //"org.springframework.transaction.config.internalTransactionAdvisor"
        System.out.println(beanNames.length);
        System.out.println(JSON.toJSONString(beanNames));

        //"dataSource",
        //"transactionManager",
        //"sqlSessionFactory",
        //"org.mybatis.spring.mapper.MapperScannerConfigurer#0",
        //"targetConnectionFactory",
        //"pooledConnectionFactory",
        //"connectionFactory",
        //"jmsTemplate",
        //"queueDestination",
        //"sessionAwareQueue",
        //"consumerMessageListener",
        //"consumerSessionAwareMessageListener",
        //"jmsContainer",
        //"sessionAwareListenerContainer",
        //"org.springframework.web.servlet.handler.MappedInterceptor#0",
        //"org.springframework.web.servlet.handler.MappedInterceptor#1",
        //"org.springframework.web.servlet.view.InternalResourceViewResolver#0",
        //"accountMapper",
        //"adminMapper",
        //"customerMapper",
        //"menuMapper",
        //"resourceMapper",
        //"roleMapper",
        //"roleMenuMapper",
        //"roleResourceMapper",
        //"userRoleMapper",
        //"org.springframework.context.annotation.internalConfigurationAnnotationProcessor",
        //"org.springframework.context.annotation.internalAutowiredAnnotationProcessor",
        //"org.springframework.context.annotation.internalRequiredAnnotationProcessor",
        //"org.springframework.context.annotation.internalCommonAnnotationProcessor",
        //"org.springframework.context.event.internalEventListenerProcessor",
        //"org.springframework.context.event.internalEventListenerFactory"
        System.out.println(rootBeanNames.length);
        System.out.println(JSON.toJSONString(rootBeanNames));
        return "Success";
    }
}

