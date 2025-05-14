/*
Student Marks Manager
Problem Statement:
Create a class Student with the following fields (as private):
•	name
•	rollNumber
•	marks[] (array of 5 subjects)
Add the following:
•	A constructor to initialize name and rollNumber.
•	A method setMarks(int[] marks) to store marks (only if all values are between 0–100).
•	A method getAverage() to return the average of the marks.
•	A method getGrade() that returns:
o	"A" if avg ≥ 90
o	"B" if avg ≥ 75
o	"C" if avg ≥ 50
o	"F" otherwise
Input:
Name: John
Roll Number: 101
Marks: [90, 85, 78, 88, 92]

Output:
Student: John (101)
Average: 86.6
Grade: B
 */
import java.util.Scanner;

class Student
{
    private String name;
    private int rollNumber;
    private int[] marks = new int[5];

    public Student(String name, int rollNumber)
    {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void setMarks(int[] marks)
    {
        if (marks.length != 5)
        {
            System.out.println("Please enter exactly 5 marks.");
            return;
        }

        for (int mark : marks)
        {
            if (mark < 0 || mark > 100)
            {
                System.out.println("Marks must be between 0 and 100.");
                return;
            }
        }

        this.marks = marks;
    }

    public double getAverage()
    {
        int sum = 0;
        for (int mark : marks)
        {
            sum += mark;
        }
        return sum / 5.0;
    }

    public String getGrade()
    {
        double avg = getAverage();
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }

    public void showDetails() {
        System.out.println("Student: " + name + " (" + rollNumber + ")");
        System.out.printf("Average: %.1f\n", getAverage());
        System.out.println("Grade: " + getGrade());
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = scan.nextInt();

        int[] marks = new int[5];
        System.out.println("Enter 5 marks (each between 0 and 100):");
        for (int i = 0; i < 5; i++)
        {
            marks[i] = scan.nextInt();
        }

        Student s = new Student(name, roll);
        s.setMarks(marks);
        s.showDetails();

        scan.close();
    }
}
