package week03;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your first score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter your second score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter your third score: ");
        double score3 = input.nextDouble();

        if (score1 < 0 || score1 > 100 || score2 < 0 || score2 > 0 || score3 < 0 || score3 > 0) {
            System.out.println("\nOne of the scores is invalid");
            return;
        } 

        double total = score1 + score2 + score3;
        double average = total / 3.0;

        System.out.println("\n***** Student Scores *****");
        System.out.println("Name: " + name);
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);



    }
}
