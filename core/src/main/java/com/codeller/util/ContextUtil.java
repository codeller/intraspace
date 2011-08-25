package com.codeller.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextUtil implements ApplicationContextAware {
	
	private static ApplicationContext CONTEXT;
	private static BeanFactory FACTORY;
	
	public static SessionFactory getSessionFactory() {
		return (SessionFactory) CONTEXT.getBean("sessionFactory");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		CONTEXT = applicationContext;
	}
}
