// How does throw differ from throws? Write code demonstrating both.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowVsThrows
{
    // Method declares that it might throw IOExc
    public static void readFile(String fileName) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        // Actually throwing an IOExc if file is not found
        String line = br.readLine(); // let's assume it throws IOExc
        System.out.println("File content: " + line);
        br.close();
    }

    public static void main(String[] args)
    {
        try
        {
            readFile("testing.txt");
        }
        catch (IOException e)
        {
            // Handling the thrown exception
            System.err.println("Exception Caught: " + e.getMessage());
        }
    }
}
