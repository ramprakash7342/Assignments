package assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//5. Write a program with menu to accept the price of certain items and display their total.
//When user selects Option 1: should accept the prices of different products and insert
//these prices into first file (each amount to be inserted in a newline in the file). Next,
//total of these values should be saved in a new file. Option 2: should allow the user to
//view the total of these prices from the second file. 

public class Question5 {
	public static void main(String[] args) {
		int choice;
		String priceString;
		Scanner sc = new Scanner(System.in);
		var filePath = "E:\\Assignments\\Core Java\\Java 11 Assignment\\priceSheet.txt";
		while (true) {
			System.out.println(
					"Select your option \n1: Insert New Price \n2: View Purchase Total \n3: Exit\n\nEnter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				String a;
				int times = 0;
				do {
					System.out.println("Insert " + (times + 1) + " price:");
					String price = sc.next();
					try {
						Files.writeString(Path.of(filePath), price + "\n", StandardOpenOption.APPEND);
						System.out.println("Price has been saved to the file");
						System.out.println("Do you want to continue(Yes/No)");
					} catch (IOException e) {
						e.printStackTrace();
					}
					a = sc.next();
					times++;
				} while (a.equalsIgnoreCase("Yes"));
				break;
			case 2:
				try {
					Integer total = 0;
					priceString = Files.readString(Path.of(filePath));
					List<String> strlist = priceString.lines().collect(Collectors.toList());
					List<Integer> arrprice = strlist.stream().map(s -> Integer.parseInt(s))
							.collect(Collectors.toList());
					for (Integer integer : arrprice) {
						total += integer;
					}
					System.out.println("Total Price of all items is: " + total + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid Choice. Please enter valid option");
			}
		}
	}

}