import java.util.Scanner;

public class StringBuff {
    public static void main(String[] args) {

        // 1
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer("Hello");

        System.out.println("Capacity of s1: " + s1.capacity());
        System.out.println("Capacity of s2: " + s2.capacity());

        // 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        StringBuffer revBuffer = new StringBuffer(input);
        revBuffer.reverse();
        String upperCaseString = revBuffer.toString().toUpperCase();
        System.out.println("Reversed uppercase: " + upperCaseString);

        // 3
        System.out.print("Enter another String: ");
        String newString = sc.nextLine();
        revBuffer.append(newString);
        System.out.println("New string: " + revBuffer);

        sc.close();
    }

}
