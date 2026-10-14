import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        int secondLargest;

        if (largest == a) {
            secondLargest = Math.max(b, c);
        } else if (largest == b) {
            secondLargest = Math.max(a, c);
        } else {
            secondLargest = Math.max(a, b);
        }

        System.out.println("Second largest number = " + secondLargest);
    }
}