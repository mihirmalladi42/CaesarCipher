import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class CaesarCipher {
    public static void encoder(ArrayList<String>letters){
        Scanner whatWord = new Scanner(System.in);
        System.out.println("What text do you want to encode/decode?: ");
        String word = whatWord.nextLine();

        Scanner howManyMovements = new Scanner(System.in);
        System.out.println("How many digits do you want to shift the text? (For example, APPLE becomes BQQMF if the digits to shift is 1) (If you use a letter that is close to the end/beginning of the alphabet, there may be an error depending on the number you put): ");
        int numWord = howManyMovements.nextInt();
        
        String[] wordSpt = word.split("");
        String[] result = new String[wordSpt.length];
        for (int i = 0; i < wordSpt.length; i++) {
            if (wordSpt[i].equalsIgnoreCase("a")) {
                result[i] = letters.get((letters.indexOf("A")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("b")) {
                result[i] = letters.get((letters.indexOf("B")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("c")) {
                result[i] = letters.get((letters.indexOf("C")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("d")) {
                result[i] = letters.get((letters.indexOf("D")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("e")) {
                result[i] = letters.get((letters.indexOf("E")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("f")) {
                result[i] = letters.get((letters.indexOf("F")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("g")) {
                result[i] = letters.get((letters.indexOf("G")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("h")) {
                result[i] = letters.get((letters.indexOf("H")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("i")) {
                result[i] = letters.get((letters.indexOf("I")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("j")) {
                result[i] = letters.get((letters.indexOf("J")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("k")) {
                result[i] = letters.get((letters.indexOf("K")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("l")) {
                result[i] = letters.get((letters.indexOf("L")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("m")) {
                result[i] = letters.get((letters.indexOf("M")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("n")) {
                result[i] = letters.get((letters.indexOf("N")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("o")) {
                result[i] = letters.get((letters.indexOf("O")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("p")) {
                result[i] = letters.get((letters.indexOf("P")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("q")) {
                result[i] = letters.get((letters.indexOf("Q")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("r")) {
                result[i] = letters.get((letters.indexOf("R")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("s")) {
                result[i] = letters.get((letters.indexOf("S")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("t")) {
                result[i] = letters.get((letters.indexOf("T")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("u")) {
                result[i] = letters.get((letters.indexOf("U")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("v")) {
                result[i] = letters.get((letters.indexOf("V")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("w")) {
                result[i] = letters.get((letters.indexOf("W")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("x")) {
                result[i] = letters.get((letters.indexOf("X")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("y")) {
                result[i] = letters.get((letters.indexOf("Y")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase("z")) {
                result[i] = letters.get((letters.indexOf("Z")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase(" ")) {
                result[i] = letters.get(letters.indexOf(" "));
            }
        }
        System.out.println("The encoded/decoded text is " + String.join("",result) + ".");
        Scanner again = new Scanner(System.in);
        System.out.println("Do you want to encode more text?: ");
        String resp = again.nextLine();

        if (resp.equalsIgnoreCase("yes")) {
            encoder(letters);
        } else {
            System.out.println("Thank you for using the encoder/decoder.");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        letters.add("G");
        letters.add("H");
        letters.add("I");
        letters.add("J");
        letters.add("K");
        letters.add("L");
        letters.add("M");
        letters.add("N");
        letters.add("O");
        letters.add("P");
        letters.add("Q");
        letters.add("R");
        letters.add("S");
        letters.add("T");
        letters.add("U");
        letters.add("V");
        letters.add("W");
        letters.add("X");
        letters.add("Y");
        letters.add("Z");
        letters.add(" ");
        encoder(letters);
    }
}
