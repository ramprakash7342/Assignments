//3) Write a generic method to exchange the positions of two different elements in an array. 

package assignment;

class Exchange<T>{
	T[] arr;

	public Exchange(T[] arr) {
		super();
		this.arr = arr;
	}

	public T[] getArr() {
		return arr;
	}
	public T[] ExchangePosition(T[] arr,int p1,int p2)
	{
		T a=arr[p1];
		arr[p1]=arr[p2];
		arr[p2]=a;
		return arr;
	}
}
public class Question3 {

	public static void main(String[] args) {
	     Integer array[]= {12,25,33,45,66};
	     System.out.println("Integer array before position change");
	     for(int i=0;i<array.length;i++)
			 System.out.print(array[i]+" ");
	     
		Exchange<Integer>  ex=new Exchange<Integer>(array);
		
		 Integer arrayInt[]=ex.ExchangePosition(array, 1,3);
		  System.out.println("\nInteger array after changing index 1 element with index 3");
		 for(int i=0;i<arrayInt.length;i++)
			 System.out.print(arrayInt[i]+" ");
		 System.out.print("\n*********************************************************************************");
		 Character array1[]= {'a','b','c','d','e'};
		 System.out.println("\ncharacter array before position change");
	     for(int i=0;i<array1.length;i++)
			 System.out.print(array1[i]+" ");
		 
		 Exchange<Character>  ex1=new Exchange<Character>(array1);

		 Character arrayChar[]=ex1.ExchangePosition(array1, 1,3);
		  System.out.println("\nCharacter array after changing index 1 element with index 3");
		 for(int i=0;i<arrayChar.length;i++)
			 System.out.print(arrayChar[i]+" ");
	}

}
