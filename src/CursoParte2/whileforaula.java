package CursoParte2;
import java.util.Scanner;
public class whileforaula {
    public static void main(String[] args) {
        int contador = 1;
        Scanner entrada = new Scanner(System.in);
        while(contador<10){
            System.out.println(contador);
            contador++;
        }

        for(int a=0;a<10;a++){
            System.out.printf("For a=%d\n",a);}

        //Para um lanço infinito em for (;true;)

        //exemplo de while indefinido
        String palavra = "";
        while(!palavra.equalsIgnoreCase("Sair")){
            System.out.println("Digite uma palavra");
            palavra = entrada.nextLine();
            System.out.printf("Você disse: %s\n",palavra);
        }

        //Do while
        //do{BLOCO DE CODIGO} While(condição);

        entrada.close();

    }
}
