package com.gof.mode.behavior.responsibility;

import org.junit.Test;

import com.gof.entity.mode.behavior.responsibility.ConcreteHandler1;
import com.gof.entity.mode.behavior.responsibility.ConcreteHandler2;
import com.gof.entity.mode.behavior.responsibility.ConcreteHandler3;
import com.gof.entity.mode.behavior.responsibility.Handler;
import com.gof.entity.mode.behavior.responsibility.Level;
import com.gof.entity.mode.behavior.responsibility.Request;

public class ResponsibilityTest {

	@Test
	public void test() {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();

		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		handler1.handleRequest(new Request(new Level(4)));
	}

}
