package com.gof.mode.behavior.state;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.gof.entity.mode.behavior.state.ConcreteStateB;
import com.gof.entity.mode.behavior.state.Context;
import com.gof.entity.mode.behavior.state.State;

public class StateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		// 创建状态
		State state = new ConcreteStateB();
		// 创建环境
		Context context = new Context();
		// 将状态设置到环境中
		context.setState(state);
		// 请求
		context.request("test");
	}

}
