//Q8. Using the below table write method apply sorting using Bubble Sort.
//
//              Example:
//
//              5 12 14 6 78 19 1 23 26 35 37 7 52 86 47   

package Assignment;


class BubbleSort{

    public int[] bubbleSort(int arr[]) {
    	for(int i=0;i<arr.length;i++)
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i]>arr[j])
    			{
    				int a=arr[i];
    				arr[i]=arr[j];
    				arr[j]=a;
    			}
    		}
    	
    	return arr;
    }
    void getOutput(int arr[])
    {
    	for(int i=0;i<arr.length;i++)
    		System.out.print(arr[i]+" ");
    }
}
public class Assignment1Q8 {

	public static void main(String[] args) {
		 int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
           
		 BubbleSort bs=new BubbleSort();
		 bs.bubbleSort(arr);
		 bs.getOutput(arr);
	}

}
