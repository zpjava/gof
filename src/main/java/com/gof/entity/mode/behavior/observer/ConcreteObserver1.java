package com.gof.entity.mode.behavior.observer;

public class ConcreteObserver1 implements Observer {

	@Override
	public void update() {
		System.out.println("ConcreteObserver1.update()");
	}

}
