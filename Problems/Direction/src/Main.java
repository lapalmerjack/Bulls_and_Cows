import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        switch(number){
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;

            case 3:
                System.out.println("move left");
                break;

            case 4:
                System.out.println("move right");


            default:
                System.out.println("error!");

        }


    }
}