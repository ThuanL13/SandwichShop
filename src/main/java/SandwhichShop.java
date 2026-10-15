import java.util.Arrays;
import java.util.Scanner;     // import the Scanner class
import java.util.*;

public class SandwhichShop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double price = 0.0;

        System.out.println("Choose sandwich size 1 or 2, 1 for Regular and 2 for Large: ");
        int size = read.nextInt();
        System.out.println("You chose sandwich: " + size);

        if (size == 1) {
            price = 5.45;
        } else if (size == 2) {
            price = 8.95;
        }

        // Asking for loaded

        System.out.println("Would you like to make it a loaded sandwich. Enter 1 for Yes or 2 for No: ");
        int loaded = read.nextInt();
        if (loaded == 1) {
            if (size == 1) {
                price += 1.00;
            } else price += 1.75;
        } else read.nextLine();

        // Asking for age
        double under17 = 0.9; // 10% discount; customer gets the sandwich for 90% of the price
        double over65 = 0.8; // 20% discount; customer gets the sanwich for 80% of the price

        // Asking for age
        System.out.println("How old are you?: ");
        int age = read.nextInt();
        System.out.println("You are: " + age + " years old");

        // Applying discounts
        if (age <= 17) {
            System.out.println("You get a 10% discount!");
            price = price * under17;
        } else if (age > 65) {
            System.out.println("You get a 20% discount!");
            price = price * over65;
        } else {
            System.out.println("No discount");
            }

        // Displaying final price
        System.out.printf("Your total is: $%.2f%n", price);

        read.close();
        }
    }

