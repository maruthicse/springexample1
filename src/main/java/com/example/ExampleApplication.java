package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.constructorinjection.Cake;
import com.example.dependency.Pizza;
import com.example.fieldinjection.IceCream;


@SpringBootApplication(scanBasePackages = { "com.example.dependency","com.example.fieldinjection"})
public class ExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
		
	// ApplicationContext context = SpringApplication.run(ExampleApplication.class, args);
	//	Pizza obj = context.getBean(Pizza.class);
	//	System.out.println("Cake : " + obj.toString()); 
		
		
		IceCream obj1 = context.getBean(IceCream.class);
		IceCream obj2 = context.getBean(IceCream.class);
		IceCream obj3 = context.getBean(IceCream.class);
		IceCream obj4 = context.getBean(IceCream.class);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}

}
