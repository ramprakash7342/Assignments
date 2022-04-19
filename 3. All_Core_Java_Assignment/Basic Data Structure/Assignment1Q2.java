package Assignment;

class ArmstrongNumBetweenRange{
	
    public int[] armstrongNumbersInRange(int min , int max){
    	int arr[]=new int[4];
    	int j=0;
    	for(int i=min;i<=max;i++)
    	{
    		int m=i;
    		int s=0;
    		while(m>=1)
    		{
    			int n=m%10;
    			s=s+(int)Math.pow(n,3);
    			m=m/10;
    		}
    		if(s==i)
    		{
    		arr[j]=i;
    		j++;
    		}
    	}
    	return arr;
    }
    public void getOutput(int arr[])
    {
    	for(int i=0;i<arr.length;i++)
		  {
			  System.out.println(arr[i]);
		  }
    }
}

public class Assignment1Q2 {

	public static void main(String[] args) {
	   
		  int min = 100;int max = 999;
		  ArmstrongNumBetweenRange arm=new ArmstrongNumBetweenRange();
		  int arr[]=arm.armstrongNumbersInRange(min, max);
		  arm.getOutput(arr);
	}

}
