package curso;
import java.util.Scanner;
public class exercicioCurso {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double Fahrenheit;
        final int variavelFormu = 32;
        final double variavelFormu2 = 5.0/9.0 ;
        Fahrenheit = input.nextDouble();
        celsius = (Fahrenheit-variavelFormu)*variavelFormu2;
        System.out.println(celsius);
    }
}
