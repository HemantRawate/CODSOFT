import java.util.Scanner;

public class StudentGaradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int Sub = sc.nextInt();

        int[] marks = new int[Sub];
        int total = 0;

        for (int i = 0; i < Sub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double Per = (double) total / Sub;
        char grade;
        if (Per >= 90) {
            grade = 'A';
        } else if (Per >= 80) {
            grade = 'B';
        } else if (Per >= 70) {
            grade = 'C';
        } else if (Per >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + Per + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
