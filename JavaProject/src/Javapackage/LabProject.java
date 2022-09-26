package Javapackage;

import java.util.*;

public class LabProject {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your firstname");
		String firstname = scanner.next();
		System.out.println("Enter your lastname");
		String lastname = scanner.next();
		
		Employee obj = new Employee(firstname,lastname);
		obj.info();
		scanner.close();
	}

		
	}