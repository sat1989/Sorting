package com;

public class Bubble {

	public static void main(String[] args) {
		int[] array={5,1,12,-5,16,2,12,14};
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 1; j < array.length; j++) {
				
				int k=j-1;
				if(array[j]<array[k]){
					int temp=array[k];
					array[k]=array[j];
					array[j]=temp;
				}
			}
		}
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
