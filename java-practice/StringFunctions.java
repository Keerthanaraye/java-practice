import java.util.*;
class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);

        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);

        int length = str.length();
        System.out.println("Length: " + length);

        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversedStr);
    }
}