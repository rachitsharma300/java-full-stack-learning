// Find frequency of each character
import java.util.HashMap;
public class CharFrequency
{
        public static void main(String[] args)
        {
            String str = "programming";

            // Create a HashMap to store character frequency
            HashMap<Character, Integer> freqMap = new HashMap<>();

            // Loop through the string
            for (char ch : str.toCharArray())
            {
                if (freqMap.containsKey(ch))
                {
                    freqMap.put(ch, freqMap.get(ch) + 1); // increase count
                }
                else
                {
                    freqMap.put(ch, 1); // first time
                }
            }

            // Print the result
            System.out.println("Character Frequencies:");
            for (char ch : freqMap.keySet())
            {
                System.out.println(ch + " = " + freqMap.get(ch));
            }
        }
    }