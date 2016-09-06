package com;

public class Insertion {

	public static void main(String[] args) {
		
		int[] array={5,2,4,6,1,3};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j >0 && j<array.length; j--) {
				if(array[j]<array[j-1]){
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
							
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
