import java.util.Scanner;

public class IT22643490_Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = input.nextInt();

        int[] notes = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count;

        for (int i = 0; i < notes.length; i++) {
            count = amount / notes[i];
            amount = amount % notes[i];

            if (notes[i] >= 20) {
                System.out.println(notes[i] + " Notes - " + count);
            } else {
                System.out.println(String.format("%02d", notes[i]) + " Coins - " + count);
            }
        }

        input.close();
    }
}