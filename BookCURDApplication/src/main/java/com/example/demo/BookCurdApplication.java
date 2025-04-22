package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCurdApplication.class, args);

//		bookServices bs=context.getBean(bookServiceImpl.class);
	//
//		int id,ch;
//		String name, aname;
//		double price;
	//
//		Scanner sc = new Scanner(System.in);
	//
//		while (true) {
//
//			System.out.println("""
//				\nBook Application
//				1. Insert Book Record
//				2. Diplay The Books
//				3. Update Record
//				4. Search by Authername
//				5. Delete Record by Id
//				6. EXIT
//				Enter the choice :
//				""");
//			ch=sc.nextInt();
//
//			switch (ch) {
//			case 1 ->{
//
//				System.out.println("Enter the Name :");
//				name = sc.next();
//				System.out.println("Enter the Auther Name :");
//				aname = sc.next();
//				System.out.println("Enter the price : ");
//				price = sc.nextDouble();
//
//				bs.add(new Book(name, aname, price));
//
//			}
//			case 2 ->{
//				bs.display().forEach(System.out::println);
//			}
//
//			case 3 ->{
//
//			}
//			case 4 ->{
//				System.out.println("Enter the id : ");
//				id= sc.nextInt();
//				bs.delete(id);
//			}
//			case 5 ->{
//				System.out.println("Enter the Author name : ");
//				aname= sc.next();
//
//				bs.search(aname).forEach(System.out::println);
//			}
//			case 6 ->{
//
//			}
//
//
//			default ->
//				System.out.println("Invalid Input !!");
//			}
//		}
	}

}
