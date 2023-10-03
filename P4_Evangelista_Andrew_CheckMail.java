import java.util.*;
/*
 * Name : Andrew Evangelista
 * Date: 9/27
 * Is lab working:  yes 
 */

public class P4_Evangelista_Andrew_CheckMail{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter dimension " + (i + 1) + ": ");
            dimensions[i] = scanner.nextInt();
        }
        System.out.print("Enter weight: ");
        int weight = scanner.nextInt();
        int length = Math.max(Math.max(dimensions[0], dimensions[1]), dimensions[2]);
        int girth = (dimensions[0] + dimensions[1] + dimensions[2] - length) * 2;
        if (girth + length > 100 && weight > 70) {
            System.out.println("Package is too large and too heavy.");
        } else if (girth + length > 100) {
            System.out.println("Package is too large.");
        } else if (weight > 70) {
            System.out.println("Package is too heavy.");
        } else {
            System.out.println("Package is acceptable.");
        }
    }
}