import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        double score1 = readScore(input, 1);
        double score2 = readScore(input, 2);
        double score3 = readScore(input, 3);

        double total = score1 + score2 + score3;
        double average = total / 3.0;

        System.out.println("\n--- STUDENT RESULT ---");
        System.out.println("Student: " + name);
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);

        input.close();
    }

    // Extension exercise: keep asking until the score is between 0 and 100.
    private static double readScore(Scanner input, int courseNumber) {
        double score;
        do {
            System.out.print("Enter score for Course " + courseNumber + ": ");
            score = input.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Enter a value between 0 and 100.");
            }
        } while (score < 0 || score > 100);
        return score;
    }
}
