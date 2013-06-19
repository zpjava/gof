package com.gof.entity.mode.structure.bridge;

public class ConcreteImplementorB extends Implementor {

	@Override
    public void operationImpl() {
        //具体操作
		System.out.println("ConcreteImplementorB.operationImpl()");
    }

}
