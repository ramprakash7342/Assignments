//Write a program that describes the hierarchy of an organization. Here we need to write 3 classes Employee, Manager & Labour 
//where Manager & Labour are the sub classes of the Employee. Manager has incentive & Labour has over time. Add the functionality 
//to calculate total salary of all the employees. Use polymorphism i.e. method overriding.       

package assignment;
import  java.util.*;

class Manager extends Assignment2Q2 {
    @Override
    public  int getSalary(int salary) {
        int incentive = 5000;
        return (salary+incentive);
        
    }
}

class Labour extends Assignment2Q2 {
	
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return (salary+overtime);
    }	
}
public class Assignment2Q2 {
	int salary = 10000;
	
    public int getSalary(int salary){
    	return salary;
    }


    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    
         int sum = 0;
		for( int i=0;i<employeeSalaries.size();i++) {
			sum+=employeeSalaries.get(i);
		}
		return sum;
    }
	
	public static void main(String[] args) {
		
	  ArrayList<Integer> employeeSalaries=new ArrayList<Integer>();
	  
         Assignment2Q2 ob;
       
         ob=new Manager();
         employeeSalaries.add(ob.getSalary(10000));
         
         ob=new Labour();
         employeeSalaries.add(ob.getSalary(10000));
         
         
         ob=new Assignment2Q2();
         System.out.println("Total Salary of employees = "+ob.totalEmployeesSalary(employeeSalaries));
	}

}
