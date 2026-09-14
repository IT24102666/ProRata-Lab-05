import java.util.Scanner;

public class IT24102666Lab5Q3 {

    // Constants
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 31;
    public static final double DISCOUNT_10_PERCENT = 0.10;
    public static final double DISCOUNT_20_PERCENT = 0.20;
    public static final int MIN_DAYS_FOR_10_PERCENT = 3;
    public static final int MIN_DAYS_FOR_20_PERCENT = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        int startDate;
        int endDate;
        int daysReserved;
        double discount;
        double payAmount;
        double payAmount_discounted;

        // Get and validate start date
        System.out.println("Enter Start Date (" + MIN_DAY + "-" + MAX_DAY + "): ");
        startDate = input.nextInt();

        if (startDate > MAX_DAY || startDate < MIN_DAY) {
            System.out.println("Error: Incorrect Start Date");
            System.exit(0);
        }

        // Get and validate end date
        System.out.println("Enter End Date (" + MIN_DAY + "-" + MAX_DAY + "): ");
        endDate = input.nextInt();

        if (endDate > MAX_DAY || endDate < MIN_DAY) {
            System.out.println("Error: Incorrect End Date");
            System.exit(0);
        }

        // Check if end date is greater than start date
        if (endDate <= startDate) {
            System.out.println("Error: End date must be greater than the Start Date.");
            System.exit(0);
        }

        // Calculate number of days reserved
        daysReserved = endDate - startDate;

        // Calculate total room charge before discount
        payAmount = ROOM_CHARGE_PER_DAY * daysReserved;

        // Determine discount based on number of days reserved
        if (daysReserved >= MIN_DAYS_FOR_20_PERCENT) {
            discount = payAmount * DISCOUNT_20_PERCENT;  // 20% discount for 5 or more days
        } else if (daysReserved >= MIN_DAYS_FOR_10_PERCENT) {
            discount = payAmount * DISCOUNT_10_PERCENT;  // 10% discount for 3-4 days
        } else {
            discount = 0;  // No discount for fewer than 3 days
        }

        // Calculate the final amount after discount
        payAmount_discounted = payAmount - discount;

        // Display the results
        System.out.println("Room Charge per Day is: Rs " + ROOM_CHARGE_PER_DAY);
        System.out.println("You are staying " + daysReserved + " days with us!");
        System.out.println("Total Payable Amount (after discount): Rs " + payAmount_discounted);

        // Close the input stream
        input.close();
    }
}
