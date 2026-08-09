import java.util.Scanner;

public class ifstatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name:");
        name = scanner.nextLine();

        System.out.print("Enter your age:");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false):");
        isStudent = scanner.nextBoolean();


        // Group 1
        if (name.isEmpty()){
            System.out.println("You didn't enter your name 😤");
        }
        else {
            System.out.println("Hello " + name + "!👋");
        }

        //Group 2
        if (age >= 65) {
            System.out.println("You are a senior citizen 🧓");
        }
        else if (age >= 18) {
            System.out.println("You are eligible to vote 🎉");
        }
        else if (age < 0){
            System.out.println("You didn't born yet!! 😕");
        }
        else if (age == 0){
            System.out.println("You are a child 👶");
        }
        else {
            System.out.println("You are not eligible to vote 🥲");
        }

        //Group 3
        if (isStudent) {
            System.out.println("You are a Student 🧑‍🎓!");
        }
        else {
            System.out.println("You are not a student!!");
        }
        scanner.close();
    }

}
