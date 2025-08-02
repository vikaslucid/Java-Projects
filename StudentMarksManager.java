import java.util.Scanner;

public class StudentMarksManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];
        int total = 0;

        // Input marks
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate percentage
        double percentage = total / 5.0;

        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        // Output
        System.out.println("\n---- Report Card ----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + " / 500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("---------------------");

        sc.close();
    }
}
