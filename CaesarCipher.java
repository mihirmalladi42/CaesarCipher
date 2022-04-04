import java.util.ArrayList;
import java.util.Scanner;
public class CaesarCipher {
    public static void encoder(ArrayList<String>letters, ArrayList<String>lettersLower){
        Scanner whatWord = new Scanner(System.in);
        System.out.println("What text do you want to encode/decode? (DO NOT USE DOUBLE QUOTATION MARKS OR BACKSLASH): ");
        String word = whatWord.nextLine();

        Scanner howManyMovements = new Scanner(System.in);
        System.out.println("How many digits do you want to shift the text? (For example, APPLE becomes BQQMF if the digits to shift is 1) (If you use a letter that is close to the end/beginning of the alphabet, there may be an error depending on the number you put): ");
        int numWord = howManyMovements.nextInt();
        
        String[] wordSpt = word.split("");
        String[] result = new String[wordSpt.length];
        for (int i = 0; i < wordSpt.length; i++) {
            if (wordSpt[i].equals("a")) {
                result[i] = lettersLower.get((lettersLower.indexOf("a")) + numWord);
            } else if (wordSpt[i].equals("b")) {
                result[i] = lettersLower.get((lettersLower.indexOf("b")) + numWord);
            } else if (wordSpt[i].equals("c")) {
                result[i] = lettersLower.get((lettersLower.indexOf("c")) + numWord);
            } else if (wordSpt[i].equals("d")) {
                result[i] = lettersLower.get((lettersLower.indexOf("d")) + numWord);
            } else if (wordSpt[i].equals("e")) {
                result[i] = lettersLower.get((lettersLower.indexOf("e")) + numWord);
            } else if (wordSpt[i].equals("f")) {
                result[i] = lettersLower.get((lettersLower.indexOf("f")) + numWord);
            } else if (wordSpt[i].equals("g")) {
                result[i] = lettersLower.get((lettersLower.indexOf("g")) + numWord);
            } else if (wordSpt[i].equals("h")) {
                result[i] = lettersLower.get((lettersLower.indexOf("h")) + numWord);
            } else if (wordSpt[i].equals("i")) {
                result[i] = lettersLower.get((lettersLower.indexOf("i")) + numWord);
            } else if (wordSpt[i].equals("j")) {
                result[i] = lettersLower.get((lettersLower.indexOf("j")) + numWord);
            } else if (wordSpt[i].equals("k")) {
                result[i] = lettersLower.get((lettersLower.indexOf("k")) + numWord);
            } else if (wordSpt[i].equals("l")) {
                result[i] = lettersLower.get((lettersLower.indexOf("l")) + numWord);
            } else if (wordSpt[i].equals("m")) {
                result[i] = lettersLower.get((lettersLower.indexOf("m")) + numWord);
            } else if (wordSpt[i].equals("n")) {
                result[i] = lettersLower.get((lettersLower.indexOf("n")) + numWord);
            } else if (wordSpt[i].equals("o")) {
                result[i] = lettersLower.get((lettersLower.indexOf("o")) + numWord);
            } else if (wordSpt[i].equals("p")) {
                result[i] = lettersLower.get((lettersLower.indexOf("p")) + numWord);
            } else if (wordSpt[i].equals("q")) {
                result[i] = lettersLower.get((lettersLower.indexOf("q")) + numWord);
            } else if (wordSpt[i].equals("r")) {
                result[i] = lettersLower.get((lettersLower.indexOf("r")) + numWord);
            } else if (wordSpt[i].equals("s")) {
                result[i] = lettersLower.get((lettersLower.indexOf("s")) + numWord);
            } else if (wordSpt[i].equals("t")) {
                result[i] = lettersLower.get((lettersLower.indexOf("t")) + numWord);
            } else if (wordSpt[i].equals("u")) {
                result[i] = lettersLower.get((lettersLower.indexOf("u")) + numWord);
            } else if (wordSpt[i].equals("v")) {
                result[i] = lettersLower.get((lettersLower.indexOf("v")) + numWord);
            } else if (wordSpt[i].equals("w")) {
                result[i] = lettersLower.get((lettersLower.indexOf("w")) + numWord);
            } else if (wordSpt[i].equals("x")) {
                result[i] = lettersLower.get((lettersLower.indexOf("x")) + numWord);
            } else if (wordSpt[i].equals("y")) {
                result[i] = lettersLower.get((lettersLower.indexOf("y")) + numWord);
            } else if (wordSpt[i].equals("z")) {
                result[i] = lettersLower.get((lettersLower.indexOf("z")) + numWord);
            } else if (wordSpt[i].equals("A")) {
                result[i] = letters.get((letters.indexOf("A")) + numWord);
            } else if (wordSpt[i].equals("B")) {
                result[i] = letters.get((letters.indexOf("B")) + numWord);
            } else if (wordSpt[i].equals("C")) {
                result[i] = letters.get((letters.indexOf("C")) + numWord);
            } else if (wordSpt[i].equals("D")) {
                result[i] = letters.get((letters.indexOf("D")) + numWord);
            } else if (wordSpt[i].equals("E")) {
                result[i] = letters.get((letters.indexOf("E")) + numWord);
            } else if (wordSpt[i].equals("F")) {
                result[i] = letters.get((letters.indexOf("F")) + numWord);
            } else if (wordSpt[i].equals("G")) {
                result[i] = letters.get((letters.indexOf("G")) + numWord);
            } else if (wordSpt[i].equals("H")) {
                result[i] = letters.get((letters.indexOf("H")) + numWord);
            } else if (wordSpt[i].equals("I")) {
                result[i] = letters.get((letters.indexOf("I")) + numWord);
            } else if (wordSpt[i].equals("J")) {
                result[i] = letters.get((letters.indexOf("J")) + numWord);
            } else if (wordSpt[i].equals("K")) {
                result[i] = letters.get((letters.indexOf("K")) + numWord);
            } else if (wordSpt[i].equals("L")) {
                result[i] = letters.get((letters.indexOf("L")) + numWord);
            } else if (wordSpt[i].equals("M")) {
                result[i] = letters.get((letters.indexOf("M")) + numWord);
            } else if (wordSpt[i].equals("N")) {
                result[i] = letters.get((letters.indexOf("N")) + numWord);
            } else if (wordSpt[i].equals("O")) {
                result[i] = letters.get((letters.indexOf("O")) + numWord);
            } else if (wordSpt[i].equals("P")) {
                result[i] = letters.get((letters.indexOf("P")) + numWord);
            } else if (wordSpt[i].equals("Q")) {
                result[i] = letters.get((letters.indexOf("Q")) + numWord);
            } else if (wordSpt[i].equals("R")) {
                result[i] = letters.get((letters.indexOf("R")) + numWord);
            } else if (wordSpt[i].equals("S")) {
                result[i] = letters.get((letters.indexOf("S")) + numWord);
            } else if (wordSpt[i].equals("T")) {
                result[i] = letters.get((letters.indexOf("T")) + numWord);
            } else if (wordSpt[i].equals("U")) {
                result[i] = letters.get((letters.indexOf("U")) + numWord);
            } else if (wordSpt[i].equals("V")) {
                result[i] = letters.get((letters.indexOf("V")) + numWord);
            } else if (wordSpt[i].equals("W")) {
                result[i] = letters.get((letters.indexOf("W")) + numWord);
            } else if (wordSpt[i].equals("X")) {
                result[i] = letters.get((letters.indexOf("X")) + numWord);
            } else if (wordSpt[i].equals("Y")) {
                result[i] = letters.get((letters.indexOf("Y")) + numWord);
            } else if (wordSpt[i].equals("Z")) {
                result[i] = letters.get((letters.indexOf("Z")) + numWord);
            } else if (wordSpt[i].equalsIgnoreCase(" ")) {
                result[i] = " ";
            } else if (wordSpt[i].equalsIgnoreCase(".")) {
                result[i] = ".";
            } else if (wordSpt[i].equalsIgnoreCase(",")) {
                result[i] = ",";
            } else if (wordSpt[i].equalsIgnoreCase("?")) {
                result[i] = "?";
            } else if (wordSpt[i].equalsIgnoreCase("!")) {
                result[i] = "!";
            } else if (wordSpt[i].equalsIgnoreCase("'")) {
                result[i] = "'";
            } else if (wordSpt[i].equalsIgnoreCase("@")) {
                result[i] = "@";
            } else if (wordSpt[i].equalsIgnoreCase("#")) {
                result[i] = "#";
            } else if (wordSpt[i].equalsIgnoreCase("$")) {
                result[i] = "$";
            } else if (wordSpt[i].equalsIgnoreCase("%")) {
                result[i] = "%";
            } else if (wordSpt[i].equalsIgnoreCase("^")) {
                result[i] = "^";
            } else if (wordSpt[i].equalsIgnoreCase("&")) {
                result[i] = "&";
            } else if (wordSpt[i].equalsIgnoreCase("*")) {
                result[i] = "*";
            } else if (wordSpt[i].equalsIgnoreCase("(")) {
                result[i] = "(";
            } else if (wordSpt[i].equalsIgnoreCase(")")) {
                result[i] = ")";
            } else if (wordSpt[i].equalsIgnoreCase("+")) {
                result[i] = "+";
            } else if (wordSpt[i].equalsIgnoreCase("=")) {
                result[i] = "=";
            } else if (wordSpt[i].equalsIgnoreCase("-")) {
                result[i] = "-";
            } else if (wordSpt[i].equalsIgnoreCase("_")) {
                result[i] = "_";
            } else if (wordSpt[i].equalsIgnoreCase("`")) {
                result[i] = "`";
            } else if (wordSpt[i].equalsIgnoreCase("~")) {
                result[i] = "~";
            } else if (wordSpt[i].equalsIgnoreCase("{")) {
                result[i] = "{";
            } else if (wordSpt[i].equalsIgnoreCase("}")) {
                result[i] = "}";
            } else if (wordSpt[i].equalsIgnoreCase("[")) {
                result[i] = "[";
            } else if (wordSpt[i].equalsIgnoreCase("]")) {
                result[i] = "]";
            } else if (wordSpt[i].equalsIgnoreCase(":")) {
                result[i] = ":";
            } else if (wordSpt[i].equalsIgnoreCase(";")) {
                result[i] = ";";
            } else if (wordSpt[i].equalsIgnoreCase("|")) {
                result[i] = "|";
            } else if (wordSpt[i].equalsIgnoreCase("<")) {
                result[i] = "<";
            } else if (wordSpt[i].equalsIgnoreCase(">")) {
                result[i] = ">";
            } else if (wordSpt[i].equalsIgnoreCase("/")) {
                result[i] = "/";
            } else if (wordSpt[i].equalsIgnoreCase("1")) {
                result[i] = "1";
            } else if (wordSpt[i].equalsIgnoreCase("2")) {
                result[i] = "2";
            } else if (wordSpt[i].equalsIgnoreCase("3")) {
                result[i] = "3";
            } else if (wordSpt[i].equalsIgnoreCase("4")) {
                result[i] = "4";
            } else if (wordSpt[i].equalsIgnoreCase("5")) {
                result[i] = "5";
            } else if (wordSpt[i].equalsIgnoreCase("6")) {
                result[i] = "6";
            } else if (wordSpt[i].equalsIgnoreCase("7")) {
                result[i] = "7";
            } else if (wordSpt[i].equalsIgnoreCase("8")) {
                result[i] = "8";
            } else if (wordSpt[i].equalsIgnoreCase("9")) {
                result[i] = "9";
            } else if (wordSpt[i].equalsIgnoreCase("0")) {
                result[i] = "0";
            }
        }
        System.out.println("The encoded/decoded text is '" + String.join("",result) + "'.");
        Scanner again = new Scanner(System.in);
        System.out.println("Do you want to encode more text?: ");
        String resp = again.nextLine();

        if (resp.equalsIgnoreCase("yes")) {
            encoder(letters, lettersLower);
        } else {
            System.out.println("Thank you for using the encoder/decoder.");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<String>();
        ArrayList<String> lettersLower = new ArrayList<String>();
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
        lettersLower.add("a");
        lettersLower.add("b");
        lettersLower.add("c");
        lettersLower.add("d");
        lettersLower.add("e");
        lettersLower.add("f");
        lettersLower.add("g");
        lettersLower.add("h");
        lettersLower.add("i");
        lettersLower.add("j");
        lettersLower.add("k");
        lettersLower.add("l");
        lettersLower.add("m");
        lettersLower.add("n");
        lettersLower.add("o");
        lettersLower.add("p");
        lettersLower.add("q");
        lettersLower.add("r");
        lettersLower.add("s");
        lettersLower.add("t");
        lettersLower.add("u");
        lettersLower.add("v");
        lettersLower.add("w");
        lettersLower.add("x");
        lettersLower.add("y");
        lettersLower.add("z");
        lettersLower.add("a");
        lettersLower.add("b");
        lettersLower.add("c");
        lettersLower.add("d");
        lettersLower.add("e");
        lettersLower.add("f");
        lettersLower.add("g");
        lettersLower.add("h");
        lettersLower.add("i");
        lettersLower.add("j");
        lettersLower.add("k");
        lettersLower.add("l");
        lettersLower.add("m");
        lettersLower.add("n");
        lettersLower.add("o");
        lettersLower.add("p");
        lettersLower.add("q");
        lettersLower.add("r");
        lettersLower.add("s");
        lettersLower.add("t");
        lettersLower.add("u");
        lettersLower.add("v");
        lettersLower.add("w");
        lettersLower.add("x");
        lettersLower.add("y");
        lettersLower.add("z");
        encoder(letters, lettersLower);
    }
}
