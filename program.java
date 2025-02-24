import java.util.Scanner; //Import the scanner class

public class program {
	public static void main(String[] args) {

		Scanner mychar = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter a character:");
		String ch = mychar.nextLine(); // read user input
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("" + ch);
			}
			System.out.println();
		}

	}
}
