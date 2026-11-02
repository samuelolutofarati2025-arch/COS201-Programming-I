package week03;

import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String name = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        double total = quantity * unitPrice;

        System.out.println("\n***** Purchase Summary *****");
        System.out.println("Item: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit Price: %.2f%n", unitPrice);
        System.out.printf("Total: %.2f%n", total);

    }
}
