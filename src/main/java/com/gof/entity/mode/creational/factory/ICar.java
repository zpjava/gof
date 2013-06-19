package com.gof.entity.mode.creational.factory;

public class ICar {

	public ICar(Underpan underpan, Wheel wheel, Engine engine) {
		System.out.println("ICar.ICar()");
	}

	public void show() {
		System.out.println("ICar.show()");
	}
	
	
}
