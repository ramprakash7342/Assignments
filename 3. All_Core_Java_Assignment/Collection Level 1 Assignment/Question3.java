//3)Store at least 10 Employee Objects in an TreeSet<Employee>. When the application runs the user should be asked to 
//  select one of the options upon which you will print the employee details in a sorted manner.
//For E.g.
//Run Application:
//a)	ID
//b)	Name
//c)	Department
//d)	Salary
//Your choice: b         <Should print all the employee’s details sorted by name>


package assignment;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	String department;
	double salary;
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}
	
}

public class Question3 {

	public static void main(String[] args) {
	
		TreeSet<Employee> ts=new TreeSet<Employee>();
	    ts.add(new Employee(121,"Amit","IT",30000));
	    ts.add(new Employee(127,"Siddhartha","CSE",40000));
	    ts.add(new Employee(129,"Ravi","IT",54000));
	    ts.add(new Employee(130,"Arvind","EEE",76000));
	    ts.add(new Employee(122,"Ram","ECE",23000));
	    ts.add(new Employee(128,"Mukesh","ECE",44000));
	    ts.add(new Employee(123,"Shayam","EEE",35000));
	    ts.add(new Employee(125,"Monu","CSE",39000));
	    ts.add(new Employee(124,"Sonu","CE",38000));
	    ts.add(new Employee(126,"Sanjay","ME",34000));
	   
	    for(Employee m:ts)
	    {
	    	System.out.println(m);
	    }
             
	}

}
