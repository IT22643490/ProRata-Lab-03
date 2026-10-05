import java.util.Scanner;

public class IT22643490_Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input price per kg
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        // Input kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        // Calculate total amount
        double totalAmount = pricePerKg * kilograms;

        // Calculate 10% discount
        double discount = totalAmount * 0.10;

        // Final amount after discount
        double finalAmount = totalAmount - discount;

        // Output result
        System.out.println("The total amount with 10% discount is: " + finalAmount);

        input.close();
    }
}