package dhani;
import java.util.*;
public class PrimeGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many primes to generate: ");
        int n = sc.nextInt();

        int count = 0, num = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

	}

}
