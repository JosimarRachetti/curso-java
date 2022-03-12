package condicoes;
import java.util.Scanner;
public class ifelseExerSemana {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia = entrada.nextLine();
        if (dia.equalsIgnoreCase("Domingo")) {
            System.out.println("1");
        } else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.println("2");
        } else if (dia.equalsIgnoreCase("Terça")) {
            System.out.println("3");
        } else if (dia.equalsIgnoreCase("Quarta")){
            System.out.println("4");
        } else if(dia.equalsIgnoreCase("Quinta")){
            System.out.println("5");
        }else if(dia.equalsIgnoreCase("Sexta")){
            System.out.println("6");
        }else{
            System.out.println("7");
        }

    }
    }
