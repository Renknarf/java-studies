import java.util.Scanner;

public class DriveYN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How old are you?: ");
		int age = in.nextInt();
		
		if(age < 16) {
			System.out.println("Sorry, you are not quite old enough to drive!");
		}
		else {
			System.out.println("Yeah! Happy driving!");
		}
	}
}
