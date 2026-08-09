import java.util.Scanner;

public class madlibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective;
        String place;
        String noun;
        String verb;

        System.out.println("Welcome to the Mad Libs!!");
        System.out.println();
        System.out.print("Enter a noun:");
        noun = scanner.nextLine();

        System.out.print("Enter a adjective:");
        adjective = scanner.nextLine();

        System.out.print("Enter a verb:");
        verb = scanner.nextLine();

        System.out.print("Enter a place:");
        place = scanner.nextLine();
        System.out.println();

        System.out.println("Your Stroy:");
        System.out.println();

        System.out.println("Today I took a " + noun + " to the " + place);
        System.out.println("It was a " +adjective+ " day because everyone wanted to "+verb+"!");
    }
}