//Q4. Supply marks of three subject and declare the result, result declaration is based on below conditions:
//
//              Condition 1: -All subjects marks is greater than 60 is Passed
//
//              Condition 2: -Any two subjects marks are greater than 60 is Promoted
//
//              Condition 3: -Any one subject mark is greater than 60 or all subjects’ marks less than 60 is failed.

package Assignment;

import java.util.*;

class ResultDeclaration{
	public double getMarks(double m)
	{
		Scanner sc=new Scanner(System.in);
		 m=sc.nextDouble();
		return m;
	}
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	if(subject1Marks>60&&subject2Marks>60&&subject3Marks>60)
          return "Passed";
    	else if((subject1Marks>60&&subject2Marks>60)||(subject2Marks>60&&subject3Marks>60)||(subject3Marks>60&&subject1Marks>60))
          return "Promoted";
    	else
    		return "failed";
    		
    }
}

public class Assignment1Q4 {

	public static void main(String[] args) {
	
		ResultDeclaration res=new ResultDeclaration();
		System.out.println("Enter the marks of three subjects");
		double m1=0,m2=0,m3=0;
		m1=res.getMarks(m1);
		m2=res.getMarks(m2);
		m3=res.getMarks(m3);
		System.out.print(res.declareResults(m1, m2, m3));
		
	}

}
