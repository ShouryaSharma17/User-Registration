import java.util.*;
import java.util.regex.*;
public class UserRegistration{
//Check First Name
	public static void checkFirstName(){
		System.out.println("Enter First Name ");
	        Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
		if(Pattern.matches(p,input)) {
		       	System.out.println("Valid First Name "+input);
	        }
		else {
		        System.out.println("Please Enter Valid First Name");

		}
	}
//Check Last Name
	public static void checkLastName(){
		System.out.println("Enter Last Name");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$";
		if(Pattern.matches(p,input)) {
			System.out.println("Valid Last Name"+input);
		}
		else {
			System.out.println("Please Enter Valid Last Name");
		}
	}
//Calling Method
	public static void main(String[] args){
		checkFirstName();
		checkLastName();
	}
}
