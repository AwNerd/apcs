import java.util.*;
/* 
 * Name: Andrew Evangelista
 * Period: 4
 * Does this code work: Yes
 * Date Submitted 9/29
 * 
*/
public class P4_Evangelista_Andrew_Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fib(0) = " + fibonacci(0));
        System.out.println("Fib(3) = " + fibonacci(3));
        System.out.println("Fib(11) = " + fibonacci(11));
        System.out.println("Fib(20) = " + fibonacci(20));

        System.out.println();

        System.out.println("7*8 = " + multiply(7, 8));
        System.out.println("5*1 = " + multiply(5, 1));
        System.out.println("5*0 = " + multiply(5, 0));
        System.out.println("0*9 = " + multiply(0, 9));
        System.out.println("0*0 = " + multiply(0, 0));
        System.out.println("45*11 = " + multiply(45, 11));

        System.out.println();

        System.out.println("-7*8 = " + multiplyAny(-7, 8));
        System.out.println("-7*-8 = " + multiplyAny(-7, -8));
        System.out.println("7*-8 = " + multiplyAny(7, -8));
        System.out.println("-7*9 = " + multiplyAny(-7, 9));
        System.out.println("-7*-9 = " + multiplyAny(-7, -9));
        System.out.println("7*-9 = " + multiplyAny(7, -9));
    }   

    public static int fibonacci(int x) {
        return (x <= 1) ? x : fibonacci(x - 1) + fibonacci(x - 2);
    }
    public static int multiply(int a, int b) {
        return (b == 0) ? 0 : a + multiply(a, b - 1);
    }

    public static int multiplyAny(int a, int b) {
        return (b == 0 || a == 0) ? 0 : (b > 0) ? a + multiplyAny(a, b - 1) : -a + multiplyAny(a, b + 1);
    }

}