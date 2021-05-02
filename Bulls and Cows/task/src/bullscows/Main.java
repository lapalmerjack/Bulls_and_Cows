package bullscows;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {

        playGame();



    }

    private static void guessTheCorrection(String secretNumber, String guessedNumber) {
        int cows = 0;
        int bulls = 0;
        //cows
        for (int i = 0; i < secretNumber.length(); i++) {
            if (secretNumber.charAt(i) == guessedNumber.charAt(i)) {
                bulls++;
            }
        }

        for (int i = 0; i < secretNumber.length(); i++) {
            for (int j = 0; j < secretNumber.length(); j++) {
                if (i != j && secretNumber.charAt(i) == guessedNumber.charAt(j)
                ) {
                    cows++;

                }
            }

        }

        if (bulls < 1 && cows > 0) {
            if (cows == 1) {
                System.out.println("Grade: " + cows + " cow");
            } else {
                System.out.println("Grade: " + cows + " cows");
            }

        } else if (cows < 1 && bulls > 0) {
            if (bulls == 1) {
                System.out.println("Grade: " + bulls + " bull");
            } else {
                System.out.println("Grade: " + bulls + " bulls");
            }

        } else if (cows > 0) {
            if (cows == 1 && bulls == 1) {
                System.out.println("Grade: " + bulls + " bull and " + cows + " cow");
            } else if (cows == 1 && bulls > 1) {
                System.out.println("Grade: " + bulls + " bulls and " + cows + " cow");
            } else if (cows > 1 && bulls == 1) {
                System.out.println("Grade: " + bulls + " bull and " + cows + " cows");
            } else {
                System.out.println("Grade: " + bulls + " bulls and " + cows + " cows.");
            }
        } else {
            System.out.println("Grade: None.");
        }


    }


    public static void playGame() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input the length of the secret code");
        System.out.print("> ");
        String codeLength = scanner.nextLine();
        int newCode = 0;
        StringBuilder newString = new StringBuilder();

        while (true){

            if(codeLength.matches("\\d+") && !codeLength.equals("0")){
                newCode = Integer.parseInt(codeLength);


            }else{
                System.out.println( "Error:"+ ""+codeLength+ "" + "isn't a valid number.");
                break;
            }

            System.out.println("Input the number of possible symbols");
            System.out.print("> ");
            String numberOfSymbols = scanner.nextLine();
            int newSymbolNumber = 0;
            if(!numberOfSymbols.matches("\\d+")){
                System.out.println(""+numberOfSymbols+ "" + " isn't a valid number.");
                break;
            }
            newSymbolNumber = Integer.parseInt(numberOfSymbols);
            if(newSymbolNumber > 36){
                System.out.println
                        ("Error: maximum number of possible symbols in the code is (0-9), a-z");
                break;
            }

            if(newCode > newSymbolNumber){
                System.out.println("Error: it's not possible to generate a code with a length of " + newCode + " with " + newSymbolNumber+" unique symbols.");
                break;
            }
            newString = uniqueCharacters(newSymbolNumber);




            String secretNumber = finalForm(newString, newCode, newSymbolNumber);
            System.out.println(secretNumber);
            System.out.print("The secret is prepared: ");

            int count = 1;
            System.out.println("Okay, let's start a game!");


            while (true) {
                System.out.println("Turn: " + count);

                System.out.print("> ");


                String guessingNumber = scanner.next();
                String[] parts = guessingNumber.split("");
                if(guessingNumber.length() != newCode){
                    System.out.println("Error: Length is not equal to new code, " +
                            "please go again with the correct length");
                    count--;
                    count++;
                    continue;
                }
                boolean check = true;
                for(int i = 0; i < parts.length;i++){
                    if(!newString.toString().contains(parts[i])){
                        check = false;
                        break;
                    }

                }
                if(!check){
                    System.out.println("Error:"+"One or more symbols from your" +
                            " guess not included in possible symbols collection" +
                            "please try again");
                    count++;
                    count--;
                    continue;

                }


                guessTheCorrection(secretNumber, guessingNumber);

                if (guessingNumber.equals(secretNumber)) {

                    break;
                }
                count++;


            }
            break;

        }

        }


    public static String finalForm(StringBuilder stringBuilder, int howManyDigits, int possibleNumbers) {

        if (howManyDigits > 36 || howManyDigits < 1 || howManyDigits >= possibleNumbers) {
            System.out.println("Error: can't generate a" +
                    " secret number with a length" +
                   " of " + howManyDigits + " because there aren't " +
                    "enough unique digits.");
            return "";


        } else {
            StringBuilder starCount = new StringBuilder();
            for(int i = 0; i<howManyDigits; i++){
                starCount.append("*");

            }

            stringBuilder = uniqueCharacters(possibleNumbers);
            String whatsInStore = "";
           if(stringBuilder.length() <= 10){
               whatsInStore = stringBuilder.charAt(0) + "-"
                       + stringBuilder.charAt(stringBuilder.length()-1);


            }else{
               whatsInStore = stringBuilder.charAt(0) + "-"
                       + stringBuilder.charAt(9) + ", " + stringBuilder.charAt(10) + "-"
                       + stringBuilder.charAt(stringBuilder.length()-1);
           }


            StringBuilder finalNumber = new StringBuilder();
           String [] finals = finalNumber.toString().split("");
            Random random = new Random();

           int count = 0;
          while (true){

              if(finalNumber.length() == howManyDigits){
                  break;
              }
              char oneCharacter = stringBuilder.charAt(random.nextInt(stringBuilder.length()));
              String oneLetter = Character.toString(oneCharacter);
              if(!finalNumber.toString().contains(oneLetter)){
                  finalNumber.append(oneLetter);



       }


   }
            System.out.println("The secret is prepared: " + starCount + " " + whatsInStore);
            System.out.println(finalNumber);
return finalNumber.toString();
    }


    }
    public static StringBuilder uniqueCharacters( int possibleSymbols) {
        String symbols = "0123456789abcdefghijklmnopqrstuvwxyz";
        String[] parts = symbols.split("");
        StringBuilder theNumbers = new StringBuilder();

        for (int i = 0; i < possibleSymbols; i++) {

            if (!theNumbers.toString().contains(parts[i]) || theNumbers.length() < possibleSymbols) {
                theNumbers.append(parts[i]);
            }


        }

        return theNumbers;
    }








}



