public class swapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping the values are \n a = " + a + " b = " + b);

        // Logic 1 | third variable
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After Swapping the values are \n a = " + a + " b = " + b);

        // Logic 2 | use + | - without using third variable
//        a = a + b;  // 10 + 20 | 30
//        b = a - b;  // 30 - 20 | 10
//        a = a - b;  // 30 - 10 | 20
//        System.out.println("After Swapping the values are \n a = " + a + " b = " + b);

        // Logic 3 | use * and / without using third variable here a & b should not be zero
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("After Swapping the values are \n a = " + a + " b = " + b);
    }
}
