/**
* Date: October 8, 2014
* Name: Amine Bourdi
* Purpose: Validating UserName and PassWord
* 
* Pseudocode
* 
* Start
* Initialize UserName as abourdi, UserPass as hello, InputUser, InputPass, CorrectChoice as admin, AccountName, count as 1
* while count is less then or equal to 3
* 	Allow user to enter username using JOptionPane
* 	if UserName equals InputUser
* 		while count is less then or equal to 3
* 			Allow user to enter password using JOptionPane	
* 			if UserPass equals InputPass
* 				break out of loop	
* 			else Use JOptionPane to tell user Password is incorrect
* 				add 1 to count
* 			endif
* 	else Tell user password is incorrect
* 		Add 1 to count
* 	endif
* 	if UserName equals InputUser 
* 		break out of loop
* 	endif
* endwhile
* if UserName does not equal InputUser or UserPass does not equal inputPass
* 	Use JOptionPane to tell user account is locked
* else
* 	while CorrectChoice does not equal AccountName
* 		case AccountName of
* 			Admin: Use JOptionPane to display "hello Admin"
* 			Student: Use JOptionPane to display "hello Student"
* 			Staff: Use JOptionPane to display "hello Staff"	
* 		endcase
* 	endwhile
* endif
* End
* 
 */

import javax.swing.JOptionPane;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
		String UserName = "abourdi";
		String UserPass = "hello";
		String InputUser = " ";
		String InputPass = " ";
		String CorrectChoice = "Admin";
		String AccountName;
		
	//Beginning of do while loop that continues while count<=3	
	do {
		InputUser = JOptionPane.showInputDialog("Please Enter Username");
		
		//if else statement to validate username
		if (UserName.equals(InputUser))	{	
			
			//beginning of second do while loop that continues while count<=3
			do {
				InputPass = JOptionPane.showInputDialog("Please Enter Password");
				
				//if else statement to validate password
				if (UserPass.equals(InputPass))
						break;
					   
				else JOptionPane.showMessageDialog(null, "Wrong Password");
					count++;
				
				if (UserPass.equals(InputPass)) break;
				
			} while (count<=3);
			
		} else JOptionPane.showMessageDialog(null, "Invalid Username");
		  count++;
		  
		  if (UserName.equals(InputUser)) break;
		  
	}while (count<=3);
	
	//if statement to make sure neither username nor password are false
	if ((!UserName.equals(InputUser))||(!UserPass.equals(InputPass)))
	JOptionPane.showMessageDialog(null, "Account Locked: Please Contact Administrator");
	
	else {
	
		//Beginning of third to while loop that continues until correct account type is selected
		do {
			String[] choices = {"Admin", "Student", "Staff"};
			AccountName = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
		
			//Beginning of switch case to decide what to do based on selected account type
			switch (AccountName) {
			
		    //first case that occurs if Admin is correct account type
			case "Admin":
				if(AccountName.equals(CorrectChoice))
				JOptionPane.showMessageDialog(null, "Hello Admin");
				break;	
				
			//second case that occurs if Student is correct account type	
			case "Student":
				if(AccountName.equals(CorrectChoice))
				JOptionPane.showMessageDialog(null, "Hello Student");
				break;
				
			//third case that occurs if Staff is correct account type	
			case "Staff":
				if(AccountName.equals(CorrectChoice))
				JOptionPane.showMessageDialog(null, "Hello Staff");
				break;	
				
				} 	 
		
			}while (!CorrectChoice.equals(AccountName));
	
		}
		
	} 

}
