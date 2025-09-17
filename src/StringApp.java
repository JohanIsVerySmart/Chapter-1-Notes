import java.util.Scanner;

public class StringApp {

    public static void main(String[] args) {
        String firstName = "Mary";
        String lastName = "Jones";
        String name = firstName + lastName;
        System.out.println(name);

        String jobTitle = "Agent";
        int employeeID = 5;
        String agent = jobTitle + employeeID;
        System.out.println(agent);

        Scanner in = new Scanner(System.in);
        System.out.print("What is today? ");
        String day = in.nextLine();
        System.out.printf("Today is %s\n", day);
        double taxRate = CashRegisterApp.TAX_RATE;
    }
}
