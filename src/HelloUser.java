
import java.util.Scanner;

public class HelloUser {
String userName;
public static void main(String userName) {

	Scanner scanner1= new Scanner(System.in);
	
	System.out.print("Enter your name: ");
	userName = scanner1.nextLine();
}
public static void greetUser(String userName) {
	System.out.println("Hello"+userName+"!");
}
}