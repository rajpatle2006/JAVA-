package Lec6;

// public class firstnonrepeating {
//         public static void main(String[] args) {
//            String 

        
//     }
//     }
import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "aabbcd";
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with frequency 1
        for (char ch : charCount.keySet()) {
            if (charCount.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}






