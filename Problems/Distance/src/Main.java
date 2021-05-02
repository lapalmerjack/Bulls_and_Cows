import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cityDistance = scanner.nextDouble();
        double speed = scanner.nextDouble();
        double total = cityDistance/speed;

        System.out.println(total);
    }
}