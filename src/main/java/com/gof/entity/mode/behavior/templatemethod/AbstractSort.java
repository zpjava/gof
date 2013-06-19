package com.gof.entity.mode.behavior.templatemethod;

public abstract class AbstractSort {
	protected abstract void sort(int[] array);
	
	public void showSortResule(int[] array){
		this.sort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
}
