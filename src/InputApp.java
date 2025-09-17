import java.util.Scanner;

public class InputApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 10: ");
        int userInt = in.nextInt();
        System.out.println("You entered: " + userInt);

        System.out.print("\nGive me a floating point value: ");
        double userDouble = in.nextDouble();
        System.out.println("You entered: " + userDouble);
        System.out.printf("Numbers divided: %.2f\n", (userDouble / userInt));
        String termination = "Done";
        System.out.printf("%s!\n", termination);
        String lastName = "Morf";
        String firstName = "Lisa";
        System.out.printf("%s, %s\n", lastName, firstName);
    }
}
