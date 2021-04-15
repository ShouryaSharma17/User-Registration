import java.util.*;
import java.util.regex.*;
public class UserRegistration{
//Check First Name
	public static void checkFirstName(){
		System.out.println("Enter a String ");
	        Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = "^[A-Z]{1}[a-zA-Z]{2}[a-zA-Z]*$"
		if(Pattern.matches(p,input)) {
		       	System.out.println("Valid First Name "+input);
	        }
		else {
		        System.out.println("Please Enter Valid First Name");

		}
	}
	public static void main(String[] args){
		checkFirstName();
	}
}
