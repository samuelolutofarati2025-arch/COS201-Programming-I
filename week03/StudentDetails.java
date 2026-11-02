package week03;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your programme: ");
        String programme = input.nextLine();

        System.out.print("Enter your level: ");
        int level = input.nextInt();

        System.out.println("\n--- STUDENT DETAILS ---");

        System.out.println("Name: " + name);
        System.out.println("Programme: " + programme);
        System.out.println("Level: " + level);



    }    
}
