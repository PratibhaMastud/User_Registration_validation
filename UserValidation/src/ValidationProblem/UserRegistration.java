package ValidationProblem;

import java.util.Scanner;

public class UserRegistration {

			Scanner userInput = new Scanner(System.in);
			
			int i=0;

			public void enterPassword() {

				while(i != 1) {
					
					System.out.println("Enter Password :");
					
					String pass = userInput.nextLine();
					
					String namePattern = "^[A-Z]{1}[a-z0-9]{7}$";
				if( pass.matches(namePattern) ){
						
						System.out.println("Password is valid");
						i = 1;
				}else {
						
					System.out.println("Please Enter valid Password whic is minimum have 8 character"); 
					}
				}
			}
			
			public static void main(String[] args) {
				
				UserRegistration userRegistration = new UserRegistration();
				
				userRegistration.enterPassword();
			}

		

	}


