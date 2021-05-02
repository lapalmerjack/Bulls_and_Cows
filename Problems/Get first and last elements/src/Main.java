import java.util.*;

public class Main {

    // write a method here

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }

    public static int[] getFirstAndLast(int [] array){
        int[] newArray = new int [2];
        for(int i =0; i < array.length; i++ ){
            if(i == 0){
                newArray[0] = array[i];
            }
            if(i == array.length-1){
                newArray[1] = array[i];
            }
        }
        return newArray;

    }
}