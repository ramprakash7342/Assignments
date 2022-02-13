//Q2. Write an application using lambda expressions to print Orders having 2 criteria implemented: 1) order price more than 
//    10000 2) order status is ACCEPTED or COMPLETED

package assingment;

import java.util.ArrayList;


interface Conditional{
	Assignment4Q2 condition(Assignment4Q2 obj);
}
public class Assignment4Q2 {

    private int totalPrice;
    private String status;

   public Assignment4Q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
   

    public int getTotalPrice() {
	    return totalPrice;
     }

    public String getStatus() {
	     return status;
    }

   
    @Override
	public String toString() {
		return "Assignment4Q2 [totalPrice=" + totalPrice + ", status=" + status + "]";
	}


	public static void main(String[] args) {
    	Assignment4Q2 obj=new Assignment4Q2(10000,"ACCEPTED");
    	Assignment4Q2 obj1=new Assignment4Q2(8500,"ACCEPTED");
    	Assignment4Q2 obj2=new Assignment4Q2(12000,"REJECTED");
    	Assignment4Q2 obj3=new Assignment4Q2(6000,"ACCEPTED");
    	Assignment4Q2 obj4=new Assignment4Q2(17000,"ACCEPTED");
    	Assignment4Q2 obj5=new Assignment4Q2(7800,"REJECTED");
    	Assignment4Q2 obj6=new Assignment4Q2(24000,"ACCEPTED");
    	Assignment4Q2 obj7=new Assignment4Q2(57000,"REJECTED");
    	
    	
    	ArrayList<Assignment4Q2>  arrlist=new ArrayList<Assignment4Q2>();
        arrlist.add(obj);
        arrlist.add(obj1);
        arrlist.add(obj2);
        arrlist.add(obj3);
        arrlist.add(obj4);
        arrlist.add(obj5);
        arrlist.add(obj6);
        arrlist.add(obj7);
  
//    without lambda ans stream        
//        for(Assignment4Q2 ll:arrlist)
//        {
//        	if(ll.totalPrice>10000&&ll.status.equals("ACCEPTED"))
//        	System.out.println(ll);
//        }
    

        arrlist.stream().filter(p1->p1.totalPrice>10000 && p1.status.equals("ACCEPTED")).forEach(System.out::println);
    }
}

