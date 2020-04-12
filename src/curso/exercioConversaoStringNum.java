package curso;
import java.util.Scanner;
public class exercioConversaoStringNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String salario1;
        String salario2;
        String salario3;

        salario1 = input.nextLine().replace(",",".");
        salario2 = input.nextLine().replace(",",".");
        salario3 = input.nextLine().replace(",",".");

        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);
        double resultado = (s1+s2+s3)/3.0;

        System.out.println(resultado);

    }
}
