package com.gof.mode.structure.adapter;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.gof.entity.mode.structure.adapter.Adapter;
import com.gof.entity.mode.structure.adapter.ConcreteTarget;
import com.gof.entity.mode.structure.adapter.Target;

public class AdapterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// 使用特殊功能类，即适配类
		Target adapter = new Adapter();
		adapter.request();
	}

}
