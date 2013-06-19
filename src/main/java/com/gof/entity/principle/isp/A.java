package com.gof.entity.principle.isp;

public class A {
	public void depend1(I1 i){
		i.method1();
	}
	public void depend2(I i){
		i.method2();
	}
	public void depend3(I i){
		i.method3();
	}
}
