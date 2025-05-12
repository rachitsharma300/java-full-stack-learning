/*
Student Report Card

🔹 Objective:
Use class, instance/static variables, and parameterized constructors.
🔹 Requirements:
•	Create a class Student with instance variables: name, rollNo, marks.
•	Use a static variable to store the schoolName.
•	Use a parameterized constructor to initialize student details.
•	Use a method displayDetails() to print student details.

🔹 Input:
Student s1 = new Student("Amit", 101, 85);
Student s2 = new Student("Priya", 102, 92);
🔹 Output:
School: ABC International
Name: Amit, Roll No: 101, Marks: 85

School: ABC International
Name: Priya, Roll No: 102, Marks: 92
 */

class StudentReportCard
{
    String name;
    int rollNo;
    int marks;

    static String schoolName = " GUVI National School";

    StudentReportCard(String name, int rollNo, int marks)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayDetails()
    {
        System.out.println("School" + schoolName);
        System.out.println("Name - " + name + ", Roll No - " + rollNo + ", Marks - " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        StudentReportCard s1 = new StudentReportCard( "Rachit", 100, 90);
        StudentReportCard s2 = new StudentReportCard( "Priya",  101, 85);

        s1.displayDetails();
        s2.displayDetails();

    }
}