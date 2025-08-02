import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ResultManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            students[i] = new Student();

            System.out.print("Enter Roll Number: ");
            students[i].rollNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            students[i].name = sc.nextLine();

            System.out.println("Enter marks for 3 subjects:");
            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                students[i].marks[j] = sc.nextInt();
            }

            students[i].calculatePercentage();
            students[i].calculateGrade();
        }

        // Writing results to file
        try {
            FileWriter writer = new FileWriter("results.txt");

            writer.write("=== All Students Result Summary ===\n");
            for (Student s : students) {
                writer.write("Roll Number: " + s.rollNumber + "\n");
                writer.write("Name: " + s.name + "\n");
                writer.write("Marks: ");
                for (int mark : s.marks) {
                    writer.write(mark + " ");
                }
                writer.write("\n");
                writer.write("Percentage: " + s.percentage + "\n");
                writer.write("Grade: " + s.grade + "\n");
                writer.write("--------------------------\n");
            }

            writer.close();
            System.out.println("\n✅ Results saved to results.txt successfully!");

        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }

        sc.close();
    }
}
