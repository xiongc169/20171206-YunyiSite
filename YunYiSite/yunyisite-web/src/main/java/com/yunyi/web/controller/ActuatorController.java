package com.yunyi.web.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
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
     * SpringMVC容器
     */
    @Autowired
    private WebApplicationContext webApplicationContext;

    /**
     * ServletContext，可以获取Spring容器、SpringMVC容器
     */
    @Autowired
    private ServletContext servletContext;

    /**
     * http://127.0.0.1:8090/actuator/getIoc
     * <p>
     * 查看Spring MVC父容器、子容器的对象的实例
     * https://www.cnblogs.com/oukele/p/9887463.html
     */
    @ResponseBody
    @RequestMapping(path = "/getIoc", method = RequestMethod.GET)
    public String getIoc() {
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");//contextConfigLocation = classpath:spring.xml
        System.out.println(contextConfigLocation);

        String[] beanNames = webApplicationContext.getBeanDefinitionNames();
        ApplicationContext parentContainer01 = webApplicationContext.getParent();
        String[] parentBeanNames = Objects.requireNonNull(parentContainer01).getBeanDefinitionNames();
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
        System.out.println(parentBeanNames.length);
        System.out.println(JSON.toJSONString(parentBeanNames));

        Object parentContainer02 = servletContext.getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);//org.springframework.web.context.WebApplicationContext.ROOT
        System.out.println(parentContainer02);

        WebApplicationContext parentContainer03 = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        System.out.println(parentContainer03);
        return "Success";
    }
}

