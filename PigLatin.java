
import java.util.ArrayList;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String english = sc.nextLine();

        ArrayList<String> arrofpiglatin = new ArrayList<String>();

        String[] arrofeng = english.split("");

        for(int x = 0;x < arrofeng.length; x++){

            arrofpiglatin.add(arrofeng[x]);

        }

        arrofpiglatin.add(arrofeng[0]);
        arrofpiglatin.add("ay");

        String piglatin = "";

        for(int x = 1;x < arrofpiglatin.size(); x++){

            piglatin = piglatin + arrofpiglatin.get(x);

        }

        System.out.println(piglatin);

    }
}
