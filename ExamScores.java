import java.util.Scanner;

public class ExamScores {
    public static void main(String[] args) {
        final int NUM = 5;
        int[] marks = new int[NUM];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the exam score of each student: ");

        for (int i = 0; i < NUM; i++) {
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        int highest = marks[0];

        for (int score : marks) {
            sum += score;
            if (score > highest) {
                highest = score;
            }
        }

        System.out.println("Highest Score: " + highest);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / 5);
        sc.close();
    }
}
