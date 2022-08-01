package Homework;

public class multiple {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //multiples of both 3 and 5 --> print "FizzBuzz" instead of 3 and 5.
            if (i%3==0 && i%5==0){
                System.out.print(" FizzBuzz ");
            }
            // multiple of 3 --> print "Fizz" instead of 3.
             else if (i%3==0) {
                System.out.print(" Fizz ");
            }
            //multiple of 5 --> print "Buzz" instead of 5.
            else if (i%5==0) {
                System.out.print(" Buzz ");

            }  else {
                System.out.print(" "+i+" ");
            }
        }
    }}
