package com.yunyi.web.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Desc RootContainerBeanPostProcessor
 * @Author
 * @Date
 * @Version 1.0
 */
public class RootContainerBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object obj, String s) throws BeansException {
        System.out.println("RootContainerBeanPostProcessor.postProcessBeforeInitialization: " + obj.getClass());
        return obj;
    }

    @Override
    public Object postProcessAfterInitialization(Object obj, String s) throws BeansException {
        //System.out.println("RootContainerBeanPostProcessor.postProcessAfterInitialization");
        return obj;
    }
}
