package com.gof.mode.creational.prototype;

import org.junit.Test;

import com.gof.entity.mode.creational.prototype.ConcretePrototype;

public class PrototypeTest {

	@Test
	public void test() {
		ConcretePrototype  concretePrototypes=new ConcretePrototype();
		for (int i = 0; i < 10; i++) {
			ConcretePrototype clonecp=(ConcretePrototype) concretePrototypes.clone();
			clonecp.show();
		}
	}

}
