package com.gof.entity.mode.behavior.visitor;

public class ConcreteElement1 extends Element {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSomething() {
		System.out.println("ConcreteElement1.doSomething()");
	}

}
