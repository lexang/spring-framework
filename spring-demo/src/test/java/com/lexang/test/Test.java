package com.lexang.test;

import com.lexang.app.AppConfig;
import com.lexang.dao.IndexDao;
import com.lexang.factoryPostProcessor.MyBeanDefinitionRegistryPostProcessor;
import com.lexang.factoryPostProcessor.MyBeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(AppConfig.class);
		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcessor());
		annotationConfigApplicationContext.refresh();
		IndexDao bean = annotationConfigApplicationContext.getBean(IndexDao.class);
		bean.query();
	}
}
