import java.util.Scanner;

public class PrimeOrEven{
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Please enter a number");
     int x = scanner.nextInt();

     if(x%2 == 0){
        System.out.println("even");
     }
     else {
        System.out.println("odd");
     }

    }
}