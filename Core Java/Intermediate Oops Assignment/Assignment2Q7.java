package assignment;

import java.util.Scanner;

abstract class DesertItem {
    abstract public int getCost(int n);
}

class Candy extends DesertItem {
	public int getCost(int n) {
		System.out.println("Candies: "+n);
		int cost = n*60;
		System.out.println("The cost of candy(ies) is: "+ cost);
		return cost;
		
	}
    public int addCandies(int candies){
    	System.out.println("Candies added.");
    	return candies;
    }
}

class Cookie extends DesertItem {
	public int getCost(int n) {
		System.out.println("Cookies: "+n);
		int cost = n*70;
		System.out.println("The cost of cookie(s) is: "+ cost);
		return cost;
	}
    public int addCookies(int cookies){
    	System.out.println("Cookies added.");
    	return cookies;
    }
}
class IceCream extends DesertItem {
	public int getCost(int n) {
		System.out.println("Ice Creams: "+n);
		int cost = n*100;
		System.out.println("The cost of ice creams(s) is: "+ cost);
		return cost;
	}
    public int addIceCreams(int ice){
    	System.out.println("Ice Creams added.");
    	return ice;
    }
}
public class Assignment2Q7 {

	static Assignment2Q7 a = new Assignment2Q7();
	Scanner sc = new Scanner(System.in);
	DesertItem c = new Candy();
	DesertItem coo = new Cookie();
	DesertItem ic = new IceCream();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a.selectRoles();
	}
	 private void selectRoles(){
		 System.out.println("Please enter your role (customer/owner): ");
		 String role = new String();
		 role = sc.next();
		 System.out.println("Your role is: "+ role);
		 roles(role);
		 
	 }
	 private void roles(String role){
		 System.out.println("Role has been assigned.");
		 if(role.equals("customer")) {
			 a.placeOrder();
			 
		 } else if (role.equals("owner")) {
			 a.addItems();
			 
		 } else {
			 System.out.print("Invalid role.");
		 }
	 }
	 private void addItems() {
		 System.out.println("List of items you can add: ");
		 System.out.println("1. Candy");
		 System.out.println("2. Cookie");
		 System.out.println("3. Ice Cream");
		 System.out.println("Enter the number: ");

		 int number = sc.nextInt();
		 switch(number) {
		 case 1->{
			 System.out.println("How many candies?");
			 int candy = sc.nextInt();
			 System.out.println(candy+" candies entered.");
			 a.addItemsOperation(candy);
		 }
		 case 2->{
			 System.out.println("How many cookies?");
			 int cookie = sc.nextInt();
			 System.out.println(cookie+" cookies entered.");
			 a.addItemsOperation(cookie);
		 }
		 case 3->{
			 System.out.println("How many ice creams?");
			 int iceCream = sc.nextInt();
			 System.out.println(iceCream+" ice creams entered.");
			 a.addItemsOperation(iceCream);
		 }
		 default->{
			 System.out.println("Enter 1 or 2 or 3 only.");
		 }
		 }

	 }
	 private void addItemsOperation(int choice) {
	    	int items = choice;
	    	System.out.println(items + " items added by owner.");
	  
	 }
	 private void placeOrder() {
		 System.out.println("List of items you can order one by one : ");
		 System.out.println("1. Candy - - - Rs. 60");
		 System.out.println("2. Cookie - - - Rs. 70");
		 System.out.println("3. Ice Cream - - - Rs. 100");
		 System.out.println("Enter the number: ");

		 int number = sc.nextInt();
		 switch(number) {
		 case 1->{		
			 System.out.println("How many candies?");
			 int candy = sc.nextInt();
			 System.out.println(candy+" candies entered.");
			 c.getCost(candy);
		
		 }
		 case 2->{
			 System.out.println("How many cookies?");
			 int cookie = sc.nextInt();
			 System.out.println(cookie+" cookies entered.");
			 coo.getCost(cookie);
		 }
		 case 3->{
			 System.out.println("How many ice creams?");
			 int iceCream = sc.nextInt();
			 System.out.println(iceCream+" ice creams entered.");
			 ic.getCost(iceCream);
		 }
		 default->{
			 System.out.println("Enter 1 or 2 or 3 only.");
		 }
		 }
		 placeOrderOperation(number);
		 
	 }
	 private void placeOrderOperation(int choice) {
		 System.out.println("Your choice number was: "+ choice);
		 System.out.println("Thank you!");
		 
	 }

}