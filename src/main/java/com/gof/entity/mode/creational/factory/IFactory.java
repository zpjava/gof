package com.gof.entity.mode.creational.factory;

public interface IFactory {
	abstract IProduct createProduct();
	abstract ICar createCar();
}
