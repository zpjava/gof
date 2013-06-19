package com.gof.mode.creational.builder;

import org.junit.Test;

import com.gof.entity.mode.creational.builder.Director;

public class BuilderTest {

	@Test
	public void test() {
		Director director=new Director();
		director.getAProduct().showProduct();
		director.getBProduct().showProduct();
	}

}
