import java.util.*;
// import java.util.Set;
class Permutations {
    
    public static List<String> singlePermutations(String input) {
        // Your code here!
      List<String> permutations = new ArrayList<>();
      Set<String> uniquePermutations = new HashSet<>();
        backtrack(input.toCharArray(), 0, uniquePermutations);
        permutations.addAll(uniquePermutations);
        return permutations;
    }
  private static void backtrack(char[] chars, int index, Set<String> permutations) {
        if (index == chars.length - 1) {
            permutations.add(String.valueOf(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            backtrack(chars, index + 1, permutations);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
