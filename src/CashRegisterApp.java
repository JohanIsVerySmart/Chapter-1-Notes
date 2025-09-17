public class CashRegisterApp {
    public static final double TAX_RATE = 0.07;

    public static void main(String[] args) {
        final double QUARTER_VALUE = 0.25;
        final double DIME_VALUE = 0.10;
        final double NICKEL_VALUE = 0.05;
        final double PENNY_VALUE = 0.01;

        double amountDue = 13.75;

        int dollars = 10;
        int quarters = 1;
        int dimes = 4;
        int nickels = 17;
        int pennies = 98;

        int number = 1_000_000;

        double payment = dollars + (quarters * QUARTER_VALUE) + (dimes * DIME_VALUE) + (nickels * NICKEL_VALUE) + (pennies * PENNY_VALUE);
        System.out.println(Math.PI);

        System.out.println(number * number);
    }
}
