package com.gof.entity.principle.srp;

/**
 * 
 * @author zrw
 *
 */
public class Animal {
	//代码级别
	public void breathe(String animal){
		if("鲨鱼".equals(animal)){
			System.out.println(animal+"呼吸水");
		}else{
			System.out.println(animal+"呼吸空气");
		}
	}
	//方法级别
	public void breathe1(String animal){
		System.out.println(animal+"呼吸水");
	}
}
