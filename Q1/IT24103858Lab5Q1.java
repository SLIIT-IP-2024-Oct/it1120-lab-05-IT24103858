import java.util.Scanner;

public class IT24103858Lab5Q1{
    public static void main(String[] args) {

        Scanner numbers= new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 =numbers.nextInt();

        System.out.print("Enter the second number: ");
        int num2 =numbers.nextInt();

        System.out.print("Enter the third number: ");
        int num3 =numbers.nextInt();
        int Smallest, Largest;
        if (num1 <= num2 && num1 <= num3) {
            Smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            Smallest = num2;
        } else {
            Smallest = num3;
        }
        if (num1 >= num2 && num1 >= num3) {
            Largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            Largest = num2;
        } else {
            Largest = num3;
        }
        System.out.println("The smallest number is: " + Smallest);
        System.out.println("The largest number is: " + Largest);
    }
}
