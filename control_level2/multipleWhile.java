package control_level2;
import java.util.*;

public class multipleWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int counter = 99;
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Invalid input");
        }

	}

}
