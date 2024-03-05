import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Allow user to enter as many student details as they want
        while (true) {
            System.out.println("Enter student ID: ");
            String studentID = scanner.next();

            System.out.println("Enter student name: ");
            String studentName = scanner.next();

            System.out.println("Enter number of extra activities: ");
            int numActivities = scanner.nextInt();

            // Create a new Student object and add extra activities
            Student student = new Student(studentName, studentName, numActivities);
            student.addExtraActivity(numActivities);

            // Display the student details
            System.out.println(student);
            System.out.println("Add another student? (y/n): ");
            String answer = scanner.next().toLowerCase();

            if (answer.equals("n")) {
                break;
            }
        }

        scanner.close();
    }
}