package Homework;
//
public class factorial {
    public static void main(String[] args) {
        int number=5, factorial=1;
        for( int i=1; i<=number; i++ ){
            factorial = factorial * i;
        }
        System.out.println("Factorial of 5 is = "+factorial);
    }
}
