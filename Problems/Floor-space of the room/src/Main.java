import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String shape = scanner.nextLine();


        switch (shape){
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();

               double p = (a + b + c) /2 ;
                System.out.println( Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;

            case"circle":
                double circle = scanner.nextDouble();
                System.out.println((circle * circle) * 3.14);
                break;

            case"rectangle":
                double weight = scanner.nextDouble();
                double height = scanner.nextDouble();
                System.out.println(weight * height);
        }
    }
}