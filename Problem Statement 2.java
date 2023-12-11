import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}

class Inventory {
    private List<Item> inventoryItems;

    public Inventory() {
        this.inventoryItems = new ArrayList<>();
    }

    public void addItem(Item newItem) {
        inventoryItems.add(newItem);
    }

    public List<Item> getInventoryItems() {
        return inventoryItems;
    }
}

public class InventoryApp {
    public static void main(String[] args) {
        Inventory myInventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInv Mgmt System");
            System.out.println("1. Add Prod");
            System.out.println("2. Display Inv");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter prod name: ");
                    String itemName = scanner.next();
                    System.out.print("Enter prod price: ");
                    double itemPrice = scanner.nextDouble();
                    System.out.print("Enter prod qty: ");
                    int itemQuantity = scanner.nextInt();

                    Item newItem = new Item(itemName, itemPrice, itemQuantity);
                    myInventory.addItem(newItem);

                    System.out.println("Prod added successfully!");
                    break;

                case 2:
                    System.out.println("\nCurrent Inv:");
                    List<Item> inventoryItems = myInventory.getInventoryItems();
                    for (Item item : inventoryItems) {
                        System.out.println("Name: " + item.getName() +
                                ", Price: $" + item.getPrice() +
                                ", Quantity: " + item.getQuantity());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
