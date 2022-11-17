package com.example.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.dependency.Topping;

@Scope(value = "prototype")
@Component
public class IceCream {

	@Autowired
	private Topping toppings;

	public Topping getToppings() {
		return toppings;
	}


	/*void setToppings(Topping toppings) {
		System.out.println("Using setter injection - " + this.toppings);
		this.toppings = toppings;
	}*/
	/*@Autowired
	public IceCream(Topping toppings) {
		// TODO Auto-generated constructor stub
		System.out.println("Using constructor injection - " + this.toppings);
		this.toppings=toppings;
	}*/

	@Override
	public String toString() {
		return "IceCream [toppings=" + toppings + "]";
	}

}
