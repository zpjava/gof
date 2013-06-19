package com.gof.entity.mode.behavior.state;

public class ConcreteStateB implements State {

	@Override
	public void handle(String sampleParameter) {
		System.out.println("ConcreteStateB handle ：" + sampleParameter);
	}

}
