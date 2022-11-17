package com.example.setterinjection;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.ExampleApplicationSI;
import com.example.dependency.Flavor;
import com.example.dependency.Topping;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExampleApplicationSI.class)
public class TestCakeClassSetterInjection {

	@Autowired
	private Cake cake;
	

//	Cake cake=new Cake();

	@Test
	public void testSetterInjection() {
		//Assert.assertNotNull(cake.getFlavor());
		//Assert.assertNotNull(cake.getToppings());
		
		System.out.println(cake.getToppings());
		System.out.println(cake.getFlavor());
		System.out.println(cake);
		assertNotNull(cake.getFlavor());
		assertNotNull(cake.getToppings());
	}
}
