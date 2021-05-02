import java.util.*;

public class Main {



    // don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }

    public static void addValueByIndex(long []array, int index, long value){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i< array.length; i++){
            if(index == i){
             array[i] =  value += array[i];

            }

        }

    }
}