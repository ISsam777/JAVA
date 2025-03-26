public class main {
	public static void main(String[] args) {

		// define a car object named myCar
		car myCar1 = new car();
		car myCar2 = new car();

		myCar1.make = "mercedes";
		myCar2.make = "toyota";

		myCar1.model = "class G";
		myCar2.model = "land cruiser";

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		// myCar1.drive();
		// myCar2.brake();
	}
}
