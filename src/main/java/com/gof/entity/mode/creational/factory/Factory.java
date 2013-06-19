package com.gof.entity.mode.creational.factory;


public class Factory implements IFactory{
	public IProduct createProduct(){
		return new Product();
	}

	@Override
	public ICar createCar() {
		Engine engine=new Engine();
		Underpan underpan=new Underpan();
		Wheel wheel=new Wheel();
		ICar car=new ICar(underpan,wheel,engine);
		return car;
	}
}
