import java.util.Scanner;

/**
 * Main class to run the student program.
 * It allows the user to enter information for multiple students
 * and then displays a detailed report for each student.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println("* Welcome To The Student Management System *");
        System.out.println("********************************************");

        // Create an array of 3 Student objects
        Student []students = new Student[3];

        // Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Loop through the array to fill student data
        for(int i = 0; i < students.length; i++){

            // Initialize each student object
            students[i] = new Student();

            // Input student name
            System.out.print("\nEnter Name of Student " + (i+1) + " :");
            students[i].setName(input.nextLine());

            // Input student ID
            System.out.print("Enter ID: ");
            students[i].setID(input.nextInt());

            // Input grades for three subjects
            System.out.print("Enter Grade for Subject 1: ");
            students[i].setGrade1(input.nextFloat());

            System.out.print("Enter Grade for Subject 2: ");
            students[i].setGrade2(input.nextFloat());

            System.out.print("Enter Grade for Subject 3: ");
            students[i].setGrade3(input.nextFloat());

            // Consume the leftover newline after nextInt/nextFloat
            input.nextLine();

            // Display student report
            students[i].displayInfo();
        }

        // Close the scanner
        input.close();
    }
}
