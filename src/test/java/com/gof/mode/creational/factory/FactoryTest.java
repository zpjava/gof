package com.gof.mode.creational.factory;

import org.junit.Test;

import com.gof.entity.mode.creational.factory.Factory;
import com.gof.entity.mode.creational.factory.ICar;
import com.gof.entity.mode.creational.factory.IFactory;

public class FactoryTest {

	@Test
	public void test() {
//		IFactory factory = new Factory();
//		IProduct product = factory.createProduct();
//		product.productMethod();
		
		IFactory factory=new Factory();
		ICar car =factory.createCar();
		car.show();
	}

}
