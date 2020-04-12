package CursoParte2;
import java.util.Scanner;
public class ExercicioPratica {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        int num;
        num = entra.nextInt();
        if(num>1){
        for(int i=2;i<=num;i++){
            if(i%num==0){
                if(i!=num){break;
                }else{
                    System.out.println("é primo");
                }
            }
        }
        }

    }
}
