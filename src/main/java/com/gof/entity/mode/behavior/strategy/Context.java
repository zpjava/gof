package com.gof.entity.mode.behavior.strategy;

public class Context {
	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void execute() {
		strategy.doSomething();
	}
}
