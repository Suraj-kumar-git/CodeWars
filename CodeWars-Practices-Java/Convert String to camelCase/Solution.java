import java.lang.StringBuilder;
class Solution{

  public static String toCamelCase(String input){
    if(input==null || input.length()==0){
      return "";
    }
   StringBuilder result = new StringBuilder();
        boolean capitalizeNextWord = false;
        boolean isUpperCase = Character.isUpperCase(input.charAt(0));

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '-' || currentChar == '_') {
                capitalizeNextWord = true;
            } else {
                if (capitalizeNextWord) {
                    result.append(Character.toUpperCase(currentChar));
                    capitalizeNextWord = false;
                } else {
                    result.append(Character.toLowerCase(currentChar));
                }
            }
        }

        if (isUpperCase) {
            result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        }

        return result.toString();
  }
  }