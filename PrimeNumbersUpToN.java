import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersUpToN {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        System.out.println("Prime numbers up to " + n + ": " + primeNumbers);
    }
}
