package assingment;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Product {
	String prod = "SAMSUNG";
}

public class Assignment4Q3 {
	static void modifyValue(int val) {
		System.out.println("Value is: " + val);
	}

	static void display() {
	}

	public static void main(String[] args) {
		Product product = new Product();
		Supplier<Boolean> boolSupplier = () -> product.prod.length() == 7; // Implementation of Supplier
		System.out.println(boolSupplier.get()); // Implementation of Supplier

		Consumer<Integer> consumer = Assignment4Q3::modifyValue; // Implementation of Consumer
		consumer.accept(20); // Implementation of Consumer

		ArrayList<String> pr = new ArrayList<String>();
		pr.add("ram");
		pr.add("amit");
		pr.add("sanjay");
		pr.add("sid");

		Predicate<String> charcount = p -> p.length() == 5;  // Implementation of Predicate
		pr.removeIf(charcount);
		System.out.println(pr);  
		
		
		Function<Integer, Integer> func = i -> i*4;   // Implementation of function method
	    System.out.println(func.apply(3));

	}
}