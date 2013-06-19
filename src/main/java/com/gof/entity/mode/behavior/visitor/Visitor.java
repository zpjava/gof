package com.gof.entity.mode.behavior.visitor;

public class Visitor implements IVisitor {

	@Override
	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}

}
