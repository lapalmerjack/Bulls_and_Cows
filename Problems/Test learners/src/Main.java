import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String parts[] = word.split(" ");
        long number1 = Long.parseLong(parts[0]);
        long number2 = Long.parseLong(parts[2]);


        switch (parts[1]) {

            case "-":
                subtractTwoNumbers(number1, number2);
                break;

            case "+":
                sumTwoNumbers(number1, number2);
                break;

            case "/":
                divideTwoNumbers(number1, number2);
                break;

            case "*":
                multiplyTwoNumbers(number1, number2);
                break;

        }

    }

    public static void subtractTwoNumbers(long number1, long number2) {
        System.out.println(number1 - number2);
    }


    public static void sumTwoNumbers(long number1, long number2) {
        System.out.println(number1 + number2);
    }


    public static void divideTwoNumbers(long number1, long number2) {
        if (number2 == 0) {
            System.out.println("Division by 0!");
        } else {

            System.out.println(number1 / number2);

        }

    }


    public static void multiplyTwoNumbers(long number1, long number2) {
        System.out.println(number1 * number2);
    }
}