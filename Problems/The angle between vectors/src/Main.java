import java.util.Scanner;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        // put your code h

        Scanner scanner = new Scanner(System.in);

        double vx = scanner.nextDouble();
        double vy = scanner.nextDouble();
        double ux = scanner.nextDouble();
        double uy = scanner.nextDouble();

        System.out.println(Math.toDegrees(Math.acos((ux * vx + vy * uy) /
                (Math.hypot(ux, uy) * Math.hypot(vx, vy)))));





    }
    public  static double angleBetween(double vx, double ux,
        double vy, double uy){
        double num = (vx*ux + vy * uy);



        double angle1 = (Math.sqrt((Math.pow(vx,2)) + (Math.pow(vy,2))));

        double angle2 = (Math.sqrt(Math.pow(ux,2) + (Math.pow(uy,2))));

        double angles = angle1 * angle2;
        double cos = num/angles;
        System.out.println(cos);


        return (int)  Math.toDegrees((Math.acos(cos)));

        }
    }
