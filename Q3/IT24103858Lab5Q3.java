import java.util.Scanner;

public class IT24103858Lab5Q3{
    
    static final double ROOM_CHARGE_PER_DAY = 48000.0;
    static final int DISCOUNT_3_TO_4_DAYS = 10;
    static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startDate, endDate;

        System.out.print("Enter Start Date(1-31): ");
        startDate = scanner.nextInt();

        System.out.print("Enter The End(1-31): ");
        endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start Date must be less than End Date. ");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than the End Date.");
        } else {
            int numberOfDays = endDate - startDate;
            int discountRate = 0;
            if (numberOfDays >= 3 && numberOfDays <= 4) {
                discountRate = DISCOUNT_3_TO_4_DAYS;
            } else if (numberOfDays >= 5) {
                discountRate = DISCOUNT_5_OR_MORE_DAYS;
            }

            double totalCost = numberOfDays * ROOM_CHARGE_PER_DAY;
            double discountAmount = totalCost * discountRate / 100;
            double finalAmount = totalCost - discountAmount;
          
           System.out.println("Number of days reserved: " + numberOfDays);
           System.out.println("Total cost before discount: Rs " + totalCost);
           System.out.println("Discount: " + discountRate + "% (Rs " + discountAmount + ")");
           System.out.println("Total amount to be paid: Rs " + finalAmount);
        }

    }
}
