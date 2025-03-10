class Point {

	int x;
	int y;
	String name;

	Point() {
	}

	boolean isOrigine() {
		return x == 0 && y == 0;
	}

	void affiche() {
		System.out.println("P:" + name + "[" + x + ";" + y + "], is Origine=" + isOrigine());
	}

	public static void main(String[] args) {

		int z = 0;
		Point p1 = new Point();
		p1.name="p1";
		Point p2 = new Point();
		p2.name="p2";
		p1.x = 3;
		p1.y = 2;

		Point p3 = new Point();
		p3=p2;
		p1.affiche();
		p2.affiche();
		p3.affiche();
	}
}
