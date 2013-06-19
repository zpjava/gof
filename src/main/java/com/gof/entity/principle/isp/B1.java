package com.gof.entity.principle.isp;

public class B1 implements I1,I2 {

	@Override
	public void method1() {
		System.out.println("B.method1()");
	}

	@Override
	public void method2() {
		System.out.println("B.method2()");
	}

	@Override
	public void method3() {
		System.out.println("B.method3()");
	}
}
