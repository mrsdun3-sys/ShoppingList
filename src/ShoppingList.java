import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<>();

        String item = "";

        while (!item.equalsIgnoreCase("done")) {
            System.out.print("Enter a grocery item (or done to finish): ");
            item = input.nextLine();

            if (!item.equalsIgnoreCase("done")) {
                groceries.add(item);
            }
        }

        System.out.println("\nYour Shopping List:");

        for (String grocery : groceries) {
            System.out.println(grocery);
        }

        input.close();
    }
}
