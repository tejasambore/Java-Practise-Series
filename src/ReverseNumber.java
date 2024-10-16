import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();

        // Using Algorithm
//        int rev = 0;
//
//        while(num != 0) {
//            rev = rev*10 + num%10;
//            num = num/10;
//        }
//        System.out.println("Reverse number is :" + rev);

        // Using String Buffer:
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();
//        System.out.println("Reverse number is: " + rev);

        // Using StringBuilder :
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println(rev);
    }
}
