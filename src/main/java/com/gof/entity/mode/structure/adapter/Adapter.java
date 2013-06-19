package com.gof.entity.mode.structure.adapter;

public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.specificRequest();
	}

}
