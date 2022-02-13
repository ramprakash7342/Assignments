package assingment;

import java.util.ArrayList;
import java.util.List;

public class Assignment4Q8 {

	public static void main(String[] args) {
		List<Integer>  arrlist=new ArrayList<>();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);
		
		Thread th=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(arrlist);
				
			}
			
		});
		
		th.run();

}
}
