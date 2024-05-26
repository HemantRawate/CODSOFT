import java.util.Scanner;

public class StudentGaradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of subjects
        System.out.print("Enter the number of subjects: ");
        int Sub = sc.nextInt();

        // Array to store marks for each subject
        int[] marks = new int[Sub];
        int total = 0;

        // Take input for marks obtained in each subject
        for (int i = 0; i < Sub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate average percentage
        double Percentage = (double) total / Sub;

        // Calculate grade based on average percentage
        char grade;
        if (Percentage >= 90) {
            grade = 'A';
        } else if (Percentage >= 80) {
            grade = 'B';
        } else if (Percentage >= 70) {
            grade = 'C';
        } else if (Percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + Percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
