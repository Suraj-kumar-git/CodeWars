import java.util.Arrays;
import java.util.Comparator;
public class Order {
  public static String order(String input) {
    // ...
    if (input.isEmpty()) {
            return "";
        }

        String[] words = input.split(" ");

        Arrays.sort(words, Comparator.comparingInt(Order::getPosition));

        return String.join(" ", words);
    }

    private static int getPosition(String word) {
        return Integer.parseInt(word.replaceAll("\\D+", ""));
    }

}
