import java.util.Scanner;

public class borne {
	public static void main(String[] args) {
		Scanner N = new Scanner(System.in);
		System.out.println("enter the year you where born:");
		int b = N.nextInt();
		int z = 2025 - b;

		System.out.println("enter your name:");
		String Name = N.nextLine();

		System.out.print(Name + " age is : " + z);
	}
}
