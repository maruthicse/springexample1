package com.example.constructorinjection;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dependency.Flavor;

@Component
public class Cake {

	private Flavor flavor;
	
	@Autowired
	Cake(Flavor flavor) {
		Objects.requireNonNull(flavor);
		this.flavor = flavor;
	}
	public Cake() {
		// TODO Auto-generated constructor stub
	}

	public Flavor getFlavor() {
		return flavor;
	}

	@Override
	public String toString() {
		return "Cake [flavor=" + flavor + "]";
	}


}
