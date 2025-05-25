/*
Q-4. Create a HashMap where keys are student names (strings) and values are their corresponding grades (integers).
Create methods to add a new student, remove a student, and Display up a student's grade by nam
*/

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeSystem
{
    // HashMap to store student data
    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize HashMap
    public StudentGradeSystem()
    {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade)
    {
        studentGrades.put(name, grade);
        System.out.println("Student added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name)
    {
        if (studentGrades.containsKey(name))
        {
            studentGrades.remove(name);
            System.out.println("Student removed: " + name);
        }
        else
        {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade
    public void displayGrade(String name)
    {
        if (studentGrades.containsKey(name))
        {
            System.out.println(name + "'s grade: " + studentGrades.get(name));
        }
        else
        {
            System.out.println("Student not found: " + name);
        }
    }

    // Main method for testing
    public static void main(String[] args)
    {
        StudentGradeSystem sgs = new StudentGradeSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        do
         {
            System.out.println("\n--- Student Grade Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameToAdd = sc.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = sc.nextInt();
                    sgs.addStudent(nameToAdd, grade);
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = sc.nextLine();
                    sgs.removeStudent(nameToRemove);
                    break;

                case 3:
                    System.out.print("Enter student name to view grade: ");
                    String nameToView = sc.nextLine();
                    sgs.displayGrade(nameToView);
                    break;

                case 4:
                    System.out.println("Exiting Thank You (:");
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
        while (choice != 4);

        sc.close();
    }
}
