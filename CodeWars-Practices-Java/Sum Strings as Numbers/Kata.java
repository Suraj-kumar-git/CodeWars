public class Kata {
  public static String sumStrings(String num1, String num2) {
   StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int currentSum = digit1 + digit2 + carry;
            int digitSum = currentSum % 10;
            carry = currentSum / 10;
            sum.insert(0, digitSum);
        }

        // Trim leading zeros
        while (sum.length() > 1 && sum.charAt(0) == '0') {
            sum.deleteCharAt(0);
        }

        return sum.toString();
  }
}
