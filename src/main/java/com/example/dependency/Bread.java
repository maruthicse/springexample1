package com.example.dependency;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Bread //implements Serializable
{

	String breadType;

	public String getBreadType() {
		return breadType;
	}

	void setBreadType(String breadType) {
		this.breadType = breadType;
	}
}
