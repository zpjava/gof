package com.gof.mode.creational.abstractFactory;

import org.junit.Test;

import com.gof.entity.mode.creational.abstractFactory.IFactory;
import com.gof.entity.mode.creational.abstractFactory.impl.Factory;

public class AbstractFactoryTest {

	@Test
	public void test() {
		IFactory factory=new Factory();
		factory.createProduct1().show();
		factory.createProduct2().show();
	}

}
