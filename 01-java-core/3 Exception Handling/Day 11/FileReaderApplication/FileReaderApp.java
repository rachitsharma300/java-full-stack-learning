/*
File Reader Application
🔹 Objective:
Read a file (like data.txt) and handle exceptions:
•	File not found
•	Input mismatch or format error
🔧 Concepts:
•	FileNotFoundException
•	IOException
•	Scanner + File reading
•	finally block for closing resources
💡 Output:
Reading from file...
Student: Alice, Score: 87
Student: Bob, Score: 91
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderApp
{
    public static void main(String[] args)
    {
        File file = new File("01-java-core/3 Exception Handling/Day 11/FileReaderApplication/data.txt");
        Scanner scan = null;

        try {
            System.out.println("Reading from file...");
            scan = new Scanner(file);

            while (scan.hasNext())
            {
                String name = scan.next();
                if (scan.hasNextInt()) {
                    int score = scan.nextInt();
                    System.out.println("Student: " + name + ", Score: " + score);
                }
                else
                {
                    System.out.println("Invalid format for score after student: " + name);
                    scan.next();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scan != null) {
                scan.close();
                System.out.println("File closed.");
            }
        }
    }
}
