import java.util.ArrayList;
import java.util.Scanner;
public class CaesarCipher {
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static void encoder(ArrayList<String>letters, ArrayList<String>lettersLower, ArrayList<String>symbolsnums){
        Scanner whatWord = new Scanner(System.in);
        System.out.println("What text do you want to encode/decode? (DO NOT USE DOUBLE QUOTATION MARKS OR BACKSLASH): ");
        String word = whatWord.nextLine();
        Scanner howManyMovements = new Scanner(System.in);
        System.out.println("How many digits do you want to shift the text? (For example, APPLE becomes BQQMF if the digits to shift is 1) (If you use a letter that is close to the end/beginning of the alphabet, there may be an error depending on the number you put): ");
        int numWord = howManyMovements.nextInt();
        String[] wordSpt = word.split("");
        String[] result = new String[wordSpt.length];
        for (int i = 0; i < wordSpt.length; i++) {
            for(int j = 0; j < 30; j++){
                if (wordSpt[i].equals(lettersLower.get(j))) {
                    result[i] = lettersLower.get((lettersLower.indexOf(lettersLower.get(j))) + numWord);
                } else if (wordSpt[i].equals(letters.get(j))) {
                    result[i] = letters.get((letters.indexOf(letters.get(j))) + numWord);
                } else if (wordSpt[i].equals(symbolsnums.get(j))) {
                    result[i] = symbolsnums.get(j);
                }
            }
        }
        System.out.println("The encoded/decoded text is '" + GREEN + String.join("",result) + RESET + "'.");
        Scanner again = new Scanner(System.in);
        System.out.println("Do you want to encode more text?: ");
        String resp = again.nextLine();
        if (resp.equalsIgnoreCase("yes")) {
            encoder(letters, lettersLower, symbolsnums);
        } else {
            System.out.println("Thank you for using the encoder/decoder.");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<String> lettersLower = new ArrayList<String>();
        ArrayList<String> symbolsnums = new ArrayList<String>();
        String[] letterArr ={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] letterLowerArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] symbolsnumsArr = {" ", "~", "`", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "+", "=", "{", "}", "[", "]", "|", "'", ":", ";", "<", ",", ".", ">", "?", "/"};
        for (int i = 0; i <= 51; i++) {
            letters.add(letterArr[i]);
            lettersLower.add(letterLowerArr[i]);
        } 
        for (int k = 0; k < 30; k++) {
            symbolsnums.add(symbolsnumsArr[k]);
        }
        encoder(letters, lettersLower, symbolsnums);
    }
}
