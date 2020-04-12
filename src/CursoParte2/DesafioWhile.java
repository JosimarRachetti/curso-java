package CursoParte2;
import java.util.Scanner;
public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total =0;
        double nota = 0;
        int quatidade = 0;

        while(nota!=-1){
            System.out.print("Digite uma nota:");
            nota=entrada.nextDouble();
            if(nota<-1 || nota>10){
                System.out.println("Nota invalida");
            }else if(nota==-1){
                System.out.println("Inputs de notas encerrado");
            }else{
                System.out.println("Nota computada");
                total+=nota;
                quatidade++;
            }

        }
        double media = total/quatidade*1.0;
        System.out.printf("Quantidade de notas computadas: %d Média:%f",quatidade,media);
    }
}
