import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        long firstNumber = Long.parseLong(parts[0]);
        String operator = parts[1];
        long numberTwo = Long.parseLong(parts[2]);
        int newNumber = 0;


        switch (operator) {
            case "+":
                System.out.println(firstNumber + numberTwo);

                break;
            case "-":
                System.out.println(firstNumber - numberTwo);
                break;

            case "/":
                if(numberTwo == 0){
                    System.out.println("Division by 0!");
                }else{
                    System.out.println(firstNumber / numberTwo);
                }
                break;

            case "*":
                System.out.println(firstNumber * numberTwo);
                break;

            default:
                System.out.println("Unknown operator");

        }
    }


}