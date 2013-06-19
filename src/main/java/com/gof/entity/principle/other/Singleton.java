package com.gof.entity.principle.other;

public class Singleton {
	@SuppressWarnings("unused")
	private byte[] a=new byte[6*1024*1024];
	private static Singleton singleton=new Singleton();
	private Singleton(){}
	
	public static Singleton getInstance(){
		return singleton;
	}
	/**
	 * VM arguments：-verbose:gc -Xms20M -Xmx20M
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton.getInstance();
		while (true) {
			new Obj();
		}
	}
}

class Obj{
	@SuppressWarnings("unused")
	private byte[] a=new byte[3*1024*1024];
}

