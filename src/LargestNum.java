import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1..");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2..");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        }  else if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } else {
            System.out.println(n2 + " is greater than " + n1);
        }
    }
}
