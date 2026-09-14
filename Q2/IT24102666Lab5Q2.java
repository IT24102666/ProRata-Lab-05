import java.util.Scanner;
public class IT24102666Lab5Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int custIntrod;

        System.out.println("Number of Customers Introduced: ");
        custIntrod = input.nextInt();

        if (custIntrod < 0) {
            System.out.println("Invalid Number");
        } else {
            switch (custIntrod) {
            case 0:
                System.out.println("You hv Won Nothing");
                break;
            case 1:
                System.out.println("You hv Won Pen");
                break;
            case 2:
                System.out.println("You hv Won Umbrella");
                break;
            case 3:
                System.out.println("You hv Won Bag");
                break;
            case 4:
                System.out.println("You hv Won Travelling Chair");
                break;
            default:
            System.out.println("You hv Won Headphone");
        }

        }

        
    }
}