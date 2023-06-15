import java.util.Map;
import java.util.HashMap;
public class DuplicateEncoder {
	static String encode(String word){word = word.toLowerCase();
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Build the new string based on the character occurrences
        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (charCount.get(c) > 1) {
                result.append(")");
            } else {
                result.append("(");
            }
        }

        return result.toString();
  }
}
