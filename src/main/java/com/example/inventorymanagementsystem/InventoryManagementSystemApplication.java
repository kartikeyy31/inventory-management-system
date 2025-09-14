package com.example.inventorymanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.HandlerExceptionResolver;

// Convention over Config, annotation
@SpringBootApplication
public class InventoryManagementSystemApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(InventoryManagementSystemApplication.class, args);
		for (String bean: ctx.getBeanDefinitionNames()) {
			Object obj = ctx.getBean(bean);
			if (obj instanceof HandlerExceptionResolver) {
				System.out.println(obj.getClass().getName() + "   KARTIKEY    ");
			}
		}
    }
}
