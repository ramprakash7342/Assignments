package assignment;

abstract class Persistence {
    abstract public String persist();
    
}
class FilePersistence extends Persistence{
  
	@Override
    public String persist() {
    	return "in the FilePersistence";
    }
}
class DatabasePersistence extends Persistence{
	@Override
    public String persist() {
    	return "in the DatabasePersitence";
    }
}

class Client{
	Persistence ob = new FilePersistence();//runtime polymorphism
	Persistence ob1 = new DatabasePersistence();
	public void getClient() {
		System.out.println(ob.persist());
		System.out.print(ob1.persist());
	}
}
public class Assignment2Q6 {

	public static void main(String[] args) {
		Client ob=new Client();
		ob.getClient();
		
	}

}
