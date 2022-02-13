package assingment;

import java.util.ArrayList;
public class Assignment4Q4 {
	public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
		
         employeeList.removeIf((s)->s.length()%2!=0);
         return employeeList;
	}
	public static void main(String[] args) {
		Assignment4Q4 ob=new Assignment4Q4();
		ArrayList<String>  arrlist=new ArrayList<String>();
        arrlist.add("abjsdj");//6
        arrlist.add("adfefefdw");//9
        arrlist.add("fddfdffd");//8
        arrlist.add("sdsdfee");//7
        arrlist.add("abjsd");//5
        arrlist.add("abjsdjwfggv");//11
        
        System.out.println(ob.removeOddLength(arrlist));
        
	}

}
