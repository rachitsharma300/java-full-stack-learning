// Explain throws keyword with a method that can throw IOException.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowIOEx
{
    static void readFile() throws IOException
    {
        // Try to Open a file that doesn't exist
        FileReader file = new FileReader("NotExist.txt");
        BufferedReader br = new BufferedReader(file);

        String line = br.readLine();
        System.out.println("Line from file: " + line);

        br.close();
    }

    public static void main(String[] args)
    {
        try
        {
            readFile(); // call method that declares exception
        }
        catch (IOException e)
        {
            // handle the exception thrown from readFile()
            System.err.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program Completed");
    }
}
