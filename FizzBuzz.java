import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Please give any number above 1\n:");

        int N = sc.nextInt();

        System.out.println(Fizzbuzz(N));

        sc.close();


    }
    
    static String Fizzbuzz(int N){

        String completedString = "";

        for(int x = 1; x <= N; x++){
            if(x%3 == 0){
                completedString = completedString+"Fizz";
            }
            if(x%5 == 0){
                completedString = completedString+"Buzz";
            }
            if(x%3 != 0 && x%5 != 0){
                completedString = completedString+x;
            }
            if(x < N){
                completedString= completedString+", ";
            }

        }

        return completedString;

    }
    
}
