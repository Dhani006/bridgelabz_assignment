package control_level2;
import java.util.*;

public class powerWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();
        if (number >= 0 && power >= 0) {
            int result = 1, counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println("Result = " + result);
        } else {
            System.out.println("Invalid input");
        }

	}

}
