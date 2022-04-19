package io.javabrains;
class minMaxClass{
	int min;
	int max;
}
public class Question2 {

	minMaxClass ob=new minMaxClass();
	public  minMaxClass findMinMax(int arr[]) {
		int min=arr[0];
		int max=arr[0];
		for(int index=1;index<arr.length;index++)
		{
			if(min>arr[index])
				min=arr[index];
			if(max<arr[index])
				max=arr[index];
		}
		ob.min=min;
		ob.max=max;
		return ob;
		
	}
}
