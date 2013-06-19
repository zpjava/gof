package com.gof.entity.mode.creational.prototype;

import java.util.ArrayList;

public class Prototype implements Cloneable{
	protected ArrayList<String> list=new ArrayList<String>();
	@SuppressWarnings("unchecked")
	public Prototype clone(){
		Prototype prototype=null;
		try {
			prototype=(Prototype) super.clone();
			prototype.list=(ArrayList<String>) this.list.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prototype;
	}
}
