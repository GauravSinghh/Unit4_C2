package question_4;

import java.util.*;
public class Person {

	String name;
	String gender;
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + getAddress() +"]";
	}



	public Address getAddress() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city");
		String city = sc.next();
		
		System.out.println("Enter state");
		String state = sc.next();
		
		System.out.println("Enter pin");
		String pin = sc.next();
		Address ad = new Address(city, state, pin );
		return ad;
	}
}
