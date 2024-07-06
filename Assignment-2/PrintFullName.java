import java.util.Scanner;

public class PrintFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Prompt the user to enter their last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Concatenate and print the full name
        String fullName = firstName + " " + lastName;
        System.out.println("Your full name is: " + fullName);

        scanner.close();
    }
}
