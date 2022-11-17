package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.fieldinjection.IceCream;

@SpringBootApplication(scanBasePackages = { "com.example.dependency", "com.example.fieldinjection" })
public class ExampleApplicationFI {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ExampleApplicationFI.class, args);
		IceCream obj1 = context.getBean(IceCream.class);
		IceCream obj2 = context.getBean(IceCream.class);
		IceCream obj3 = context.getBean(IceCream.class);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	
		
	}

}
