import java.util.*;

public class Solution {

    public static String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();
        
        // Step 2: Split the string by spaces to get words
        String[] words = s.split("\\s+");
        
        // Step 3: Reverse the order of words
        Collections.reverse(Arrays.asList(words));
        
        // Step 4: Join the words with a single space
        return String.join(" ", words);
    }

}