//Q6. Replace every word in the list with its upper case equivalent. Use replaceAll() method & Unary Operator interface.
package assingment;

import java.util.ArrayList;
import java.util.List;

public class Assignment4Q6 {

    public List<String> convertToUpperCase(List<String> list) {
    	
    	list.replaceAll((s)->s.toUpperCase());
    	return list;
    } 
	public static void main(String[] args) {
		Assignment4Q6 ob=new Assignment4Q6();
		List<String>  arrlist=new ArrayList<>();
        arrlist.add("abjsdj");//6
        arrlist.add("adfefefdw");//9
        arrlist.add("fddfdffd");//8
        arrlist.add("sdsdfee");//7
        arrlist.add("abjsd");//5
        arrlist.add("abjsdjwfggv");//11
        
        System.out.print(ob.convertToUpperCase(arrlist));
	}

}
