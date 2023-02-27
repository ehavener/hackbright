import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        Scanner scanner = new Scanner(System.in);
        String placeOrder = scanner.nextLine();
        ArrayList<Object> order = new ArrayList<Object>();
        if (placeOrder.equalsIgnoreCase("Y")) {
        } else {
            System.out.println("Have a nice day then");
        }
        order.add(LocalDate.now());
        order.add(LocalTime.now());
        System.out.println("Here is the menu:");
        System.out.println("Cupcakes:");
        int itemNumber = 0;
        for (int i = 0; i < cupcakeMenu.size(); i++) {
            itemNumber++;
            System.out.println(itemNumber + ".");
            cupcakeMenu.get(i).type();
            System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
            System.out.println();
        }
        System.out.println("Drinks:");
        for (int i = 0; i < drinkMenu.size(); i++) {
            itemNumber++;
            System.out.println(itemNumber + ".");
            drinkMenu.get(i).type();
            System.out.println("Price: $" + drinkMenu.get(i).getPrice());
            System.out.println();
        }
        boolean ordering = true;
        while (ordering == true) {
            System.out.println("Enter the item number corresponding to the item you would like to order");
            int orderChoice = scanner.nextInt();
            scanner.nextLine();

            switch(orderChoice) {
                case 1:
                    order.add(cupcakeMenu.get(0));
                    System.out.println("Item added to order");
                    break;
                case 2:
                    order.add(cupcakeMenu.get(1));
                    System.out.println("Item added to order");
                    break;
                case 3:
                    order.add(cupcakeMenu.get(2));
                    System.out.println("Item added to order");
                    break;
                case 4:
                    order.add(drinkMenu.get(0));
                    System.out.println("Item added to order");
                    break;
                case 5:
                    order.add(drinkMenu.get(1));
                    System.out.println("Item added to order");
                    break;
                case 6:
                    order.add(drinkMenu.get(2));
                    System.out.println("Item added to order");
                    break;
                default:
                    System.out.println("That is not a valid item number");
                    break;
            }

            System.out.println("Would you like to continue ordering? (Y/N)");
            String continueOrdering = scanner.nextLine();
            if (continueOrdering.equalsIgnoreCase("Y")) {
                ordering = true;
            } else {
                ordering = false;
            }
        }
    }
}
