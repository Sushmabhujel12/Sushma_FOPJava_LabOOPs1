package Javapackage;


import java.util.Random;
import java.util.Scanner;
public class Employee {

	

	//create a java class and declare the variables
  String firstname;
 String lastname;
 
  String password;
   String department;
  String emailaddress;
 
   String comName = "abc.com";
 
// constructor in which we will accept firstname and lastname.
 
 public Employee (String firstname, String lastname) {
	 this.firstname = firstname;
	 this.lastname = lastname ;
	 
	//call method for department
	 this.department = setDepartment();
	 
	 
	
	  
	 System.out.println("Dear "  +this.firstname +" your generated credentials are as follows");
	 		  
	 
	 this.password = generatePassword(8);
	
 
}





	//ask for department
  public String setDepartment() {

	 System.out.print("Please enter the department from the following :\n1) Technical \n2) Admin \n3) Human Resource \n4) Legal\n");        
      Scanner scanner = new Scanner (System.in);
      int department = scanner.nextInt();
      
      scanner.close();
      if (department==1 ) {return "Technical";}
      
      else if (department==2) {return "Admin";}
       else if (department==3) {return "Human Resource";}
        else if (department==4) {return "Legal";}
      
        return setDepartment ();
    
	 } 
 
 //generate a random password 

  public String generatePassword(int length) {
	  String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[length];

      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
      for(int i = 4; i< length ; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
		 
	  

return new String(password);
	 
}
  
  public void info() {
	   //System.out.println("Name:" +firstname + " " + lastname);
	   System.out.println("Email ---->:" +this.firstname.toLowerCase() + "." + this.lastname.toLowerCase() + "@"  + this.department + "." +comName );
	   System.out.println("Password -----> :" + this.password);
  }
  } 
  

   
   
   

 

 
 
 
 