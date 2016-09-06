package com;

public class Selection{

public static void main(String []args){


	int[] array={5,1,12,-5,16,2,12,14};
	
	for(int i=0;i<array.length;i++){
	    
	    int j=i+1;
	    int k=0;
	    int min=array[i];
	    
	    while(j<array.length){
	        if(min>array[j]){
	            k=j;
	            min=array[j];
	            j++;
	        }else{
	            j++;
	        }
	    }

	    if(k!=0){
	    int temp=array[i];
	    array[i]=array[k];
	    array[k]=temp;
	    }
	    
	}
	
	for(int j=0;j<array.length;j++){
	    System.out.println(array[j]);
	}
	
}

}