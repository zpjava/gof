package com.gof.entity.principle.lsp;

public class B extends A{
	public int func1(int a,int b){
		return a+b;
	}
	
	public int func2(int a,int b){
		return func1(a,b)+100;	
	}
}
