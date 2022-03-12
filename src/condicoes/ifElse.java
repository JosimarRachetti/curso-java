package condicoes;
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um valor:");
        int valor=entrada.nextInt();

        if(valor % 2 ==0){
            System.out.println("é um numero par");
        }else{
            System.out.println("não é par");
        }

        if(valor>10){System.out.println("é maior que dez");
        }else if(valor > 5){
            System.out.print("é maior que cinco");
        }else{
            System.out.print("é menor que dez e cinco");
        }
}}
