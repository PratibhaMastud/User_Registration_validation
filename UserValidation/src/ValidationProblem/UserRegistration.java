package ValidationProblem;

import java.util.Scanner;

public class UserRegistration {

			Scanner userInput = new Scanner(System.in);
			
			int i=0;

			public void enterFastName() {

				while(i != 1) {
					
					System.out.println("Enter First Name ");
					
					String firstName = userInput.nextLine();
					
					String namePattern = "^[A-Z]{1}[a-z]{2,}$";

				if( firstName.matches(namePattern) ){
						
						System.out.println("First name is valid");
						i = 1;
				}else {
						
					System.out.println("Please Enter valid First Name starting with capital letter and should have minimum 3 Character in the string"); 
					}
				}
			}
			
			public static void main(String[] args) {
				
				UserRegistration userRegistration = new UserRegistration();
				
				userRegistration.enterFastName();
			}

		

	}


