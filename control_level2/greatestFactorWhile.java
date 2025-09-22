package control_level2;
import java.util.*;

public class greatestFactorWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer!");
        } else {
            int greatestFactor = 1;      
            int c = n - 1;    
            while (c >= 1) {
                if (n % c == 0) {
                    greatestFactor = c;
                    break; 
                }
                c--; 
            }

            System.out.println("The greatest factor of " + n + " besides itself is: " + greatestFactor);
       
    }

	}

}
