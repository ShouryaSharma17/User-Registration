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
//Check Email
	public static void checkEmail(){
		System.out.println("Enter Email");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = "[a-zA-z]{1,}[.]?[a-z]{1,}?[@]+[a-zA-z]{1,}[.]+[a-z]{1,}[.]?[a-z]{1,}?";
		if(Pattern.matches(p,input)) {
		       	System.out.println("Valid Email "+input);
	        }
		else {
		        System.out.println("Please Enter Valid Email");

		}
	}
//Check Phone Number
	public static void checkPhoneNumber(){
		System.out.println("Enter Phone Number");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = "^[0-9]{2}\\s[0-9]{10}";
		if(Pattern.matches(p,input)) {
			System.out.println("Valid Phone Number"+input);
		}
		else {
			System.out.println("Please Enter Valid Phone Number");
		}
	}
//Check Password(At least 1 Numeric Number)
	public static void checkPassword(){
		System.out.println("Enter password");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p= "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
		if(Pattern.matches(p,input)) {
			System.out.println("Valid Password"+input);
		}
		else {
			System.out.println("Please Enter Valid Password");
		}
	}
//Check Email Samples
	public static void checkEmailSamples(){
		String p = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		ArrayList<String> email = new ArrayList<String>();
		email.add("abc@yahoo.com");
		email.add("abc-100@yahoo.com");
		email.add("abc.100@yahoo.com");
		email.add("abc111@yahoo.com");
		email.add("abc-100@abc.net");
		email.add("abc.@gmail.com");
		email.add("abc@%*.com");
		email.add("abc@abc@gmail.com");
		email.add("abc()*@gmail.com");
		email.add("abc@.com.my");
		for(int i=0; i < email.size(); i++)
		{
			if(Pattern.matches(p,email.get(i))) {
				System.out.println("Valid Email Sample");
			}
			else{
				System.out.println("Invalid Email Sample");
			}
		}
	}
//Calling Method
	public static void main(String[] args){
		checkFirstName();
		checkLastName();
		checkEmail();
		checkPhoneNumber();
		checkPassword();
		checkEmailSamples();
	}
}
