import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      double number = scanner.nextDouble();
      double threes = number * number * number;
      double twos = number * number;
      double once = threes + twos + number + 1;

        System.out.println(once);

    }
}