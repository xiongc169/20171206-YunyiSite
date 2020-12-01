package com.yunyi.web.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class SubContainerBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object obj, String s) throws BeansException {
        System.out.println("SubContainerBeanPostProcessor.postProcessBeforeInitialization: " + obj.getClass());
        return obj;
    }

    @Override
    public Object postProcessAfterInitialization(Object obj, String s) throws BeansException {
        //System.out.println("SubContainerBeanPostProcessor.postProcessAfterInitialization");
        return obj;
    }
}
