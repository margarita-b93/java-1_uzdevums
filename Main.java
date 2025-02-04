import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your height in meters: ");
        double height_m = scan.nextDouble();

        System.out.println("Do you like programming? (Yes/No)");
        boolean hasString = scan.hasNext();

        System.out.println("You are: ");

        int a = age * 365;
        System.out.println(a + " " + "days old");

        double b = height_m * 100;
        System.out.println(b + " " + "centimeters tall");

    }
}