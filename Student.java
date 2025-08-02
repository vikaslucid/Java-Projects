public class Student {
    int rollNumber;
    String name;
    int[] marks = new int[3];
    double percentage;
    char grade;

    void calculatePercentage() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += marks[i];
        }
        percentage = sum / 3.0;
        System.out.println("The percentage is: " + percentage);
    }

    void calculateGrade() {
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else {
            grade = 'F'; // Fail
        }
        System.out.println("The grade is: " + grade);
    }
}
