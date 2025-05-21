import java.util.Scanner;

public class GymMembership {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Gym Membership Management System!");
        System.out.print("Enter member name: ");
        String name = sc.nextLine();
        System.out.print("Enter member age: ");
        int age = sc.nextInt();
        System.out.print("Is the membership active? (true/false): ");
        boolean isActive = sc.nextBoolean();
        System.out.print("Enter membership duration (in months): ");
        int duration = sc.nextInt();
        double membershipFee = duration * 50.0;
        System.out.println("\nMember Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Status: " + (isActive ? "Active" : "Inactive"));
        System.out.println("Membership Duration: " + duration + " months");
        System.out.println("Membership Fee: $" + membershipFee);
        sc.close();
    }
}