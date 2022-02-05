//1)	Given a TreeMap<Long, Contact> which has phone numbers for keys and contact objects for values.
//
//     Write solutions to 
//a.	Fetch all the keys and print them, 
//b.	Fetch all the values and print them
//c.	Print all key-value pairs


package assignment;
import java.util.*;

class Contacts{
    long  PhoneNumber;
	String name;
	String email;
	gender gen;
	public enum gender{
		Male, Female;
	}
	public Contacts(long  phoneNumber, String name, String email,gender gen) {
		super();
		PhoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.gen=gen;
	}
	
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	public gender getGen() {
		return gen;
	}


	@Override
	public String toString() {
		return "[PhoneNumber:" + PhoneNumber + ", name:" + name + ", email:" + email +", gender:"+gen+ "]";
	}
	
	
}
public class Question1 {

	public static void main(String[] args) {
		
          Contacts.gender m=Contacts.gender.Male;
          Contacts.gender f=Contacts.gender.Female;
          Contacts c1=new Contacts(9622567848L,"Ram","ram@eamil.com",m);
          Contacts c2=new Contacts(9622595997L,"Neha","neha@eamil.com",f);
          Contacts c3=new Contacts(9622553544L,"Rahul","rahul@eamil.com",m);
          Contacts c4=new Contacts(9623774563L,"Monu","monu@eamil.com",m);
          TreeMap<Long,Contacts>  tm=new TreeMap<Long,Contacts>(Collections.reverseOrder());
          tm.put(c1.PhoneNumber, c1);
          tm.put(c2.PhoneNumber, c2);
          tm.put(c3.PhoneNumber, c3);
          tm.put(c4.PhoneNumber, c4);
          
          
        //a.	Fetch all the keys and print them, 
          System.out.print("KEYS\n");
          for(Map.Entry<Long,Contacts> tmp:tm.entrySet())
            System.out.println(tmp.getKey());
        
        //b.	Fetch all the values and print them
          System.out.println("VALUES");
          for(Map.Entry<Long,Contacts> tmp:tm.entrySet())
            System.out.println(tmp.getValue());
        //c.	Print all key-value pairs
          System.out.println("KEY     -         VALUES");
          for(Map.Entry<Long,Contacts> tmp:tm.entrySet())
          {
        	  System.out.println(tmp.getKey()+"     "+tmp.getValue());
          }
          
	}

}
