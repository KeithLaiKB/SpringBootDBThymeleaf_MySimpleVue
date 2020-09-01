package com.mytest.testweb_package;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

//@SpringBootApplication
//@SpringBootApplication 底层等同于@EnableAutoConfiguration+@ComponentScan。
/*
@Configuration
@EnableAutoConfiguration
@ComponentScan
*/

@SpringBootApplication
//@ServletComponentScan	//servelet注册
@ComponentScan(basePackages={"com.mytest.testweb_package"})
//@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class Test1NameApplication extends SpringBootServletInitializer {

	/*
	public static void main(String[] args) {
		SpringApplication.run(Test1NameApplication.class, args);
	}*/
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Test1NameApplication.class);
				
	}
	
	
	
		
	
	public static void main(String[] args) {
			
			//SpringApplication.run(Test1NameApplication.class, args);
			
			
			
		   	ApplicationContext applicationContext = SpringApplication.run(Test1NameApplication.class, args);
			
			String[] beanNames =  applicationContext.getBeanDefinitionNames();
			System.out.println("加载beans的个数：" + beanNames.length);
			for(String bn : beanNames){
				System.out.println(bn);
			}
			
			String[] serviceNames = applicationContext.getBeanNamesForAnnotation(Service.class);
			System.out.println("加载service的个数：" + serviceNames.length);
			for(String sn : serviceNames){
				System.out.println(sn);
			}
			
			ThymeleafViewResolver thymeleafViewResolver = (ThymeleafViewResolver)applicationContext.getBean(ThymeleafViewResolver.class);
			thymeleafViewResolver.setRedirectHttp10Compatible(false);
					
	}

}
