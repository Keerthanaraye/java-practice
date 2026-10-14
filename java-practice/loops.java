import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // For loop
        System.out.println("For Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // While loop
        System.out.println("While Loop:");
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        // Do-while loop
        System.out.println("Do-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= n);
    }
}