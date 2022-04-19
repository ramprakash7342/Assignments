//1) Use a HashSet to hold Employee Objects. Upon running the application, the details of the
//   employees added to the HashSet should be displayed. 
//Employee <<class>>
// |-- id
// |-- name
// |-- salary
// |-- department
// |-- displayDetails()
//Feel free to add properties and methods to Employee Class 

package assignment;
import java.util.*;

class Employee{
	int id;
	String name;
	double salary;
	String department;
	void displayDetails(int id,String name,double salary,String department)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
}
public class Question1 {

	public static void main(String[] args) {
		HashSet<Employee> set=new HashSet<>();
		 Employee emp1=new Employee();
		 Employee emp2=new Employee();
		 Employee emp3=new Employee();
		 emp1.displayDetails(121,"Ram", 30000, "IT");
		 emp2.displayDetails(122,"Rahul",40000,"CSE");
		 emp3.displayDetails(123,"Sanjay",45000,"ECE");
         set.add(emp1);
         set.add(emp2);
         set.add(emp3);
         
         for(Employee e:set)
         {
        	 System.out.println(e.id+" "+e.name+" "+e.salary+" "+e.department);
         }
	}

}
