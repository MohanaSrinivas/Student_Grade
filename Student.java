import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentGrades = new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Grade Tracker Menu:");
            System.out.println("1. Add new student and grade");
            System.out.println("2. View list of students and grades");
            System.out.println("3. Calculate and display average grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();

                    // Add new student and grade
                    studentNames.add(name);
                    studentGrades.add(grade);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // View list of students and grades
                    System.out.println("\nList of Students and Grades:");
                    for (int i = 0; i < studentNames.size(); i++) {
                        System.out.println(studentNames.get(i) + ": " + studentGrades.get(i));
                    }
                    break;

                case 3:
                    // Calculate and display average grade
                    if (studentGrades.size() == 0) {
                        System.out.println("No students added yet.");
                    } else {
                        int total = 0;
                        for (int gradeValue : studentGrades) {
                            total += gradeValue;
                        }
                        double average = (double) total / studentGrades.size();
                        System.out.println("Average Grade: " + average);
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting Student Grade Tracker. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
