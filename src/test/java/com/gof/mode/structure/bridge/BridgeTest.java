package com.gof.mode.structure.bridge;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.gof.entity.mode.structure.bridge.ConcreteImplementorA;
import com.gof.entity.mode.structure.bridge.ConcreteImplementorB;
import com.gof.entity.mode.structure.bridge.RefinedAbstraction;

public class BridgeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		new RefinedAbstraction(new ConcreteImplementorA()).operation();
		new RefinedAbstraction(new ConcreteImplementorB()).operation();
	}

}
