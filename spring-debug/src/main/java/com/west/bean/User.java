package com.west.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String id;
	private String name = "杜波";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
