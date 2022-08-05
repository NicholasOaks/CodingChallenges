import java.time.format.TextStyle;
import java.util.Scanner;

public class PigLatinImproved {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a word to convert to pig latin");

        String input = sc.nextLine();

        System.out.println(convertPigLating(input));
        
    }

    static String convertPigLating(String original){

        StringBuilder sb = new StringBuilder(original);

        sb.deleteCharAt(0);
        sb.append(original.charAt(0));
        sb.append("ay");

        return sb.toString();

    }


}
