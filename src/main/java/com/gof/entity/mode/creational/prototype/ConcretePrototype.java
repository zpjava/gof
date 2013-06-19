package com.gof.entity.mode.creational.prototype;


public class ConcretePrototype extends Prototype {
	public void show(){
		System.out.println("原型模式实现类");
		System.out.println(super.list);
	}
}
