package com.gof.entity.mode.behavior.observer;

public class ConcreteSubject extends Subject {

	@Override
	public void doSomething() {
		System.out.println("ConcreteSubject.doSomething()");
		this.notifyObserver();
	}

}
