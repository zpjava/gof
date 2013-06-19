package com.gof.entity.mode.creational.abstractFactory.impl;

import com.gof.entity.mode.creational.abstractFactory.IFactory;
import com.gof.entity.mode.creational.abstractFactory.IProduct1;
import com.gof.entity.mode.creational.abstractFactory.IProduct2;

public class Factory implements IFactory {

	@Override
	public IProduct1 createProduct1() {
		return new Product1();
	}

	@Override
	public IProduct2 createProduct2() {
		return new Product2();
	}

}
