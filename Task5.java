import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            int value;
            while (true) {
                System.out.print("Enter score " + (i + 1) + " (0-100): ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                    continue;
                }
                value = scanner.nextInt();
                if (value >= 0 && value <= 100) {
                    break;
                }
                System.out.println("Invalid score. It must be from 0 to 100.");
            }
            scores[i] = value;
        }

        int passed = 0, failed = 0, sum = 0;
        System.out.print("Scores:");
        for (int s : scores) {
            System.out.print(" " + s);
            sum += s;
            if (s >= 60) passed++;
            else failed++;
        }
        System.out.println();
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Average: " + (double) sum / scores.length);
        scanner.close();
    }
}
