import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Please enter a number");
     int x = scanner.nextInt();

        if(x==1){
            System.out.println("This is not a prime number");
        }

        for(int y = x-1;y > 0;y--){

            if(y == 1){
                System.out.println("This is a prime number");
                break;
            }
            if(x%y==0){
                System.out.println("This is not prime number");
                break;
            }
        }
        scanner.close();
    }
}