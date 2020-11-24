package ValidationProblem;

import java.util.Scanner;

public class UserRegistration {

			Scanner userInput = new Scanner(System.in);
			
			int i=0;

			public void enterMobileNumber() {

				while(i != 1) {
					
					System.out.println("Enter Mobile Number in Predefined Format");
					
					String mobileNo = userInput.nextLine();
					
					String namePattern = "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
				if( mobileNo.matches(namePattern) ){
						
						System.out.println("Mobile Number  is valid");
						i = 1;
				}else {
						
					System.out.println("Please Enter valid Mobile Number in this form - 91 9983243552"); 
					}
				}
			}
			
			public static void main(String[] args) {
				
				UserRegistration userRegistration = new UserRegistration();
				
				userRegistration.enterMobileNumber();
			}

		

	}


