import java.util.Scanner;

public class IT22643490_Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();

        // Input OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = input.nextDouble();

        // Input OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otRate = input.nextDouble();

        // Calculate OT amount
        double otAmount = otHours * otRate;

        // Calculate total salary
        double totalSalary = monthlySalary + otAmount;

        // Display result
        System.out.println("The total salary including OT is: " + totalSalary);

        input.close();
    }
}