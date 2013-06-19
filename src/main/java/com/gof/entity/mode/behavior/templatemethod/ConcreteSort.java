package com.gof.entity.mode.behavior.templatemethod;

public class ConcreteSort extends AbstractSort {

	@Override
	protected void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			selectSort(array,i);
		}
	}

	private void selectSort(int[] array, int index) {
		int minValue=327;
		int indexMin=0;
		int temp;
		for (int j = index; j < array.length; j++) {
			if(array[j]<minValue){
				minValue=array[j];
				indexMin=j;
			}
		}
		temp=array[index];
		array[index]=array[indexMin];
		array[indexMin]=temp;
	}

}
