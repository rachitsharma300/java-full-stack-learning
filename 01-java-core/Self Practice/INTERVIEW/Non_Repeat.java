// Write a Java program to find the first non-repeating character in a string.

import java.util.HashMap;
import java.util.Map;

public class Non_Repeat {
    public static void main(String []args) {
        String str = "aabbcdde";

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (freqMap.get(ch) == 1) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No Non-Repeating Character Found");
    }

}
