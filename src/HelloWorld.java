
import java.util.Scanner;

public class HelloWorld {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you now? :)");
		
		System.out.println("Enter your name:");
		Scanner input= new Scanner(System.in);
		String userName = input.next();
		
		HelloUser user1 = new HelloUser(userName);
		user1.greetUser();
		
		
	}

}
