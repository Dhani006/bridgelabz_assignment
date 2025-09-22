
package switch_assignment;
import java.util.*;
public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1 -> System.out.println("Result: " + (a + b));
                    case 2 -> System.out.println("Result: " + (a - b));
                    case 3 -> System.out.println("Result: " + (a * b));
                    case 4 -> {
                        if (b != 0) System.out.println("Result: " + (a / b));
                        else System.out.println("Cannot divide by zero!");
                    }
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        System.out.println("Exiting program...");

	}

}
