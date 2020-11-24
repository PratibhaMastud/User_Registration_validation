package ValidationProblem;

import java.util.Scanner;

public class UserRegistration {

			Scanner userInput = new Scanner(System.in);
			
			int i=0;

			public void enterEmail() {

				while(i != 1) {
					
					System.out.println("Enter Email Address ");
					
					String email = userInput.nextLine();
					
					String namePattern = "^([a-z]{3,})([.]{0,1}[a-z]*)@([a-z]{2}).([a-z]{2})([.]{1}[a-z]{2}){0,1}$";

				if( email.matches(namePattern) ){
						
						System.out.println("Email  is valid");
						i = 1;
				}else {
						
					System.out.println("Please Enter valid Email in this form - abc.xyz@bl.co.in"); 
					}
				}
			}
			
			public static void main(String[] args) {
				
				UserRegistration userRegistration = new UserRegistration();
				
				userRegistration.enterEmail();
			}

		

	}


