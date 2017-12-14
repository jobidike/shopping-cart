import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Order order = new Order();
		
		String continueShopping;
		
		System.out.println("Welcome to the online Nike Store!");
		
		Item item;
		do {
		System.out.println("Enter the name of the item: ");
		String itemName = input.nextLine();
		System.out.println("Enter the price: ");
		double price = input.nextDouble();
		System.out.println("Enter the quantity: ");
		int quantity = input.nextInt();
		
		item = new Item(itemName, price, quantity);
		order.addOrder(item);
		
		System.out.println("Current Cart");
		order.currentOrder();
		
		input.nextLine();
		System.out.println("Do you want to continue shopping? (y/n)");
		continueShopping = input.nextLine();
		} while (continueShopping.equals("y"));
		System.out.println("Do you want to remove anything from your cart? (y/n)");
		String choice = input.nextLine();
		while(choice.equals("y")) {
			System.out.println("Enter the name of the item you want to remove.");
			String name = input.nextLine();
			System.out.println("You are removing " + name);
			order.removeOrder(name);
			System.out.println("Would you like to remove anything else? (y/n)");
			choice = input.nextLine();
		}
		System.out.println("Thank you for shopping at Nike! \nHere is your final cart total: ");
		order.currentOrder();
		
		
		
		
	}		
}