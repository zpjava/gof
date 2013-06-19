package com.gof.entity.mode.creational.builder;

public class ConcreteBuilder extends Builder {
	private Product product=new Product();
	@Override
	public void setPart(String a1, String a2) {
		product.setName(a1);
		product.setType(a2);
	}

	@Override
	public Product getProduct() {
		return product;
	}

}
