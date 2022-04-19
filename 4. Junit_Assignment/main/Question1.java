package io.javabrains;


public class Question1 {

	public int[]  findMinMax(int arr[]) {
		int min=arr[0];
		int max=arr[0];
		for(int index=1;index<arr.length;index++)
		{
			if(min>arr[index])
				min=arr[index];
			if(max<arr[index])
				max=arr[index];
		}
		int arr1[]= {min,max};
		return arr1;
		
	}
}
