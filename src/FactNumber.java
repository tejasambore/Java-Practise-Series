import java.util.Scanner;

public class FactNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        int num = sc.nextInt();
        int fact = 1;

        if (num != 0) {
            for (int i=1; i<=num; i++) {
                fact *= i;
            }
            System.out.println("The factorial of a nunber is " + fact);
        } else {
            System.out.println("You have entered 0, the factorial of 0 is: " + fact);
        }
    }
}
