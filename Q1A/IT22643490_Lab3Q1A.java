import java.util.Scanner;

public class IT22643490_Lab3Q1A{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get price per 1kg
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        // Get number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        // Calculate total amount
        double totalAmount = pricePerKg * kilograms;

        // Display result
        System.out.println("The total amount is: " + totalAmount);

        input.close();
    }
}