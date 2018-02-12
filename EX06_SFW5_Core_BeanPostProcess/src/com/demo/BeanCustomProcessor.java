package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
/**
 * Ordered implementation is optional
 * @author SR00492780
 *
 */
public class BeanCustomProcessor implements BeanPostProcessor ,Ordered{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("1.Before : " + beanName);
		System.out.println("1.Bean Value : " + bean);
		return bean;
	}
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("1.After : " + beanName);
		System.out.println("1.Bean Value : " + bean);
		return bean;
	}
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

	
}
