import java.util.Scanner;
public class IT24102666Lab5Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        

        System.out.println("Enter First Integer Number: ");
        num1 = input.nextInt();
        System.out.println("Enter Second Integer Number: ");
        num2 = input.nextInt();
        System.out.println("Enter Third Integer Number: ");
        num3 = input.nextInt();

        int highestNum = num1;
        if (highestNum < num2) {
            highestNum = num2;
        }

        if (num2 < num3) {
            highestNum = num3;
        }

        int lowestNum = num1;
        if (lowestNum > num2) {
            lowestNum = num2;
        }

        if (num2 < num3) {
            lowestNum = num3;
        }

        System.out.println("The Highest Number is " + highestNum);
        System.out.println("The Lowest Number is " + lowestNum);
        

        
    }
}