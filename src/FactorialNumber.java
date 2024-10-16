public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        // ascending order : 1*2*3*4*5
//        for (int i=1; i<=num; i++) {
//            fact = fact*i;
//        }

        // descending order : 5*4*3*2*1
        for (int i=num; i>=1; i--) {
            fact = fact*i;
        }
        System.out.println("The factorial is :" + fact);
    }
}
