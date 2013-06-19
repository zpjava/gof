package com.gof.entity.mode.creational.builder;

public class Product {
	private String name;
	private String type;
	public void showProduct(){
		System.out.println("name:"+name);
		System.out.println("type:"+type);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
