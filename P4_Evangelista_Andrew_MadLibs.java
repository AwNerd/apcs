import java.util.Scanner;
/*
    Name:      Andrew Evangelista
    Date:      9/25
    Period:     4

    Is this lab fully working?  Yes
*/

public class P4_Evangelista_Andrew_MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Mad Libs!\n");
        
        System.out.print("Please enter a place: ");
        String place = scanner.nextLine();

        System.out.print("Please enter an emotion: ");
        String emotion1 = scanner.next();

        System.out.print("Please enter a color: ");
        String color = scanner.next();

        System.out.print("Please enter an adjective: ");
        String adjective1 = scanner.next();

        System.out.print("Please enter an integer: ");
        int integer1 = scanner.nextInt();

        System.out.print("Please enter another integer: ");
        int integer2 = scanner.nextInt();

        System.out.print("Please enter a double: ");
        double double1 = scanner.nextDouble();

        System.out.print("Please enter another double: ");
        double double2 = scanner.nextDouble();

        System.out.print("Please enter a vehicle: ");
        scanner.nextLine();  
        String vehicle = scanner.nextLine();

        System.out.print("Please enter an animal: ");
        String animal = scanner.next();

        System.out.print("Please enter an emotion: ");
        String emotion2 = scanner.next();

        System.out.printf("\nHere's your Mad Lib Story:\n\n" + "In the mystical land of %s, where emotions like %s float in the air, \n" +
                          "I stumbled upon a %s crystal. It was the most %s thing I'd ever seen.\n" + 
                          "As I picked it up, %d %s-colored %ss suddenly zoomed past me at a speed of %.2f mph!\n" +
                          "I hopped into my %s to follow them, but was distracted by a %s playing an instrument.\n" +
                          "It looked at me with its eyes full of %s, and I realized this journey was going to be unlike any other.\n", 
                          place, emotion1, color, adjective1, integer1, color, vehicle, double1, vehicle, animal, emotion2);
    }
}
