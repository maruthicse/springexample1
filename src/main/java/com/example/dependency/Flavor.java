package com.example.dependency;

import org.springframework.stereotype.Component;

@Component
public class Flavor {

	String flavorType="spicy";
	String color="white";

	public String getFlavorType() {
		return flavorType;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Flavor [flavorType=" + flavorType + ", color=" + color + "]";
	}

}
