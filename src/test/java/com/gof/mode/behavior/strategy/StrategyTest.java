package com.gof.mode.behavior.strategy;

import org.junit.Test;

import com.gof.entity.mode.behavior.strategy.ConcreteStrategy1;
import com.gof.entity.mode.behavior.strategy.ConcreteStrategy2;
import com.gof.entity.mode.behavior.strategy.Context;

public class StrategyTest {

	@Test
	public void test() {
		Context context;
		System.out.println("-----执行策略1-----");
		context = new Context(new ConcreteStrategy1());
		context.execute();

		System.out.println("-----执行策略2-----");
		context = new Context(new ConcreteStrategy2());
		context.execute();
	}
}
