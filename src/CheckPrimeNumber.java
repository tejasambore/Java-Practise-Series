import java.util.Scanner;
// Write a program to check if the given number is prime or not.

// Prime Number - A number that is divisible only by 1 and itself
//  Example - 1, 3, 5, 7, 11, 13

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        for (int i=1; i<=num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
