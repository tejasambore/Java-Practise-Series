import java.util.Scanner;
// Write a program to checks if the number is even or odd

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number..");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an Even Number");
        } else {
            System.out.println(num + " is an Odd Number");
        }
    }
}
