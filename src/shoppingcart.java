import java.util.Scanner;
public class shoppingcart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int count;
        double total;

        System.out.print("What item would you like to buy?:");
        item = scanner.nextLine();

        System.out.print("What is the price for each?:");
        price = scanner.nextDouble();

        System.out.print("How many would you like?:");
        count = scanner.nextInt();

        total = count * price;

        System.out.println();
        System.out.println("You hava bought " + count + " " + item +"/s");
        System.out.println("Your total is $" + total);
        scanner.close();
    }
}
