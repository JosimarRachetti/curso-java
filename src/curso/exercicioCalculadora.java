
package curso;
import java.util.Scanner;
public class exercicioCalculadora {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    int numUm = input.nextInt();
    int numDois = input.nextInt();
    String operador = input.next();

    int valor = "+".equals(operador) ? numUm + numDois:0;
    valor = "-".equals(operador) ? numUm - numDois : valor;
    valor = "*".equals(operador) ? numUm * numDois : valor;
    valor = "/".equals(operador) ? numUm / numDois : valor;
    valor = "%".equals(operador) ? numUm / numDois : valor;
    System.out.println(valor);

    input.close();
    }
}
