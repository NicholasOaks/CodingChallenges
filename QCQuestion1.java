import javax.swing.SpinnerDateModel;

public class QCQuestion1 {

    public static void main(String[] args) {

        System.out.println(getLast(30,4,5));
        
    }


    static public int getLast(int N, int P, int Q){

    int johnAmount = 0;
    int jackAmount = 0;
    
    while(N > 0){
        N =  N - P;
        johnAmount = johnAmount + P;
        if(N <=0){
            return johnAmount + N;
        }
        N = N - Q;
        jackAmount = jackAmount + Q;
        if(N <=0){
            return jackAmount + N;
        }
    }
            
    return -404;
    }

















    
}
