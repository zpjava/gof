package com.gof.entity.mode.creational.singleton;

/**
 *  根据实例化对象时机的不同分为：饿汉式单例，懒汉式单例
 *  饿汉式单例
 *  public class Singleton{
		private static Singleton singleton=new Singleton();
		private Singleton(){}
		public static Singleton getInstance(){
			return singleton;
		}
	}
 *  
 *  懒汉是单例
 *	public class Singleton{
		private static Singleton singleton;
		private Singleton(){}
		public static synchronized Singleton getInstance(){
			if(singleton==null){
				singleton=new Singleton();
			}
			return singleton;
		}
	}
 * 
 */
public class Singleton{
	private static Singleton singleton;
	private Singleton(){}
	public static synchronized Singleton getInstance(){
		if(singleton==null){
			singleton=new Singleton();
		}
		return singleton;
	}
}