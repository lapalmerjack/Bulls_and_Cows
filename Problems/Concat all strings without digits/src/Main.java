import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder newString = new StringBuilder();
        StringBuilder build = new StringBuilder();

       for(int i = 0; i< strings.length; i++) {
          newString.append(strings[i]);
      }
       for(int i = 0;i< newString.length(); i++) {
          if(!Character.isDigit(newString.charAt(i))) {
              build.append(newString.charAt(i));

          }

      }
      return build.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
