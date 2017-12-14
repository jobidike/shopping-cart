import java.util.ArrayList; //addItem, removeItem by name and display the currentOrder.

public class Order {

	ArrayList<Item> items = new ArrayList<Item>();

	public void addOrder(Item item) {
		items.add(item);
	}

	public void removeOrder(String name) {
		for (int i = items.size() - 1; i >= 0; i--) {
			if (items.get(i).getName().equals(name)) {
				items.remove(i);
			}
		}

	}

	public void currentOrder() {
		double totalPrice = 0;
		for (Item item : items) {
			//System.out.println(item.toString());
			 System.out.println("Item: " + item.getName() + " Price: "
			 + item.getPrice() + " Quantity: " + item.getQuantity());
			 totalPrice += item.getPrice() * item.getQuantity();
		}
		System.out.println("Total Price: " + totalPrice);
	}

}
