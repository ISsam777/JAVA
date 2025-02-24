import java.util.Scanner;

public class arithmetic {
	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("enter a and b:");
		int a = N.nextInt();
		int b = N.nextInt();
		int z = a + b;

		String firstName = N.nextLine();
		String lastName = N.nextLine();
		String fullName = firstName + lastName;

		System.out.print(fullName + " age is : " + z);
	}
}
