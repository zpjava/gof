package com.gof.entity.mode.structure.proxy;



public class RealSubject extends Subject {

	public RealSubject() {
	}

	@Override
	public void request() {
		 System.out.println( " From real subject. " );		
	}
    

}
