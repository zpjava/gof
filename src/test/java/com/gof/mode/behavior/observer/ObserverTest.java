package com.gof.mode.behavior.observer;

import org.junit.Test;

import com.gof.entity.mode.behavior.observer.ConcreteObserver1;
import com.gof.entity.mode.behavior.observer.ConcreteObserver2;
import com.gof.entity.mode.behavior.observer.ConcreteSubject;
import com.gof.entity.mode.behavior.observer.Subject;

public class ObserverTest {

	@Test
	public void test() {
		Subject sub = new ConcreteSubject();
		sub.addObserver(new ConcreteObserver1()); // 添加观察者1
		sub.addObserver(new ConcreteObserver2()); // 添加观察者2
		sub.doSomething();
	}

}
