public class Main {
	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		Item item1 = new Item("generic item", 1);
		Fruit fruit = new Fruit("royal", "apple", 22);
		Weapon weapon = new Weapon("sword", 2, 65, "katana");

		inventory.addItem(item1);
		inventory.addItem(fruit);
		inventory.addItem(weapon);

		inventory.displayInventory();
	}
}
