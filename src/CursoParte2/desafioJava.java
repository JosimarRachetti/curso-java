package CursoParte2;
import java.util.Scanner;
import java.util.Random;
public class desafioJava {
 public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	Random gerador = new Random();
	
	int aleatorio = gerador.nextInt(101);
	int valor;
	int i;
	for(i=10;i>0;i--) {
		System.out.printf("Chances %d digite um valor:\n",i);
		valor = entrada.nextInt();
		if(aleatorio == valor) {
			System.out.print("Acertou");
			break;
		}else if(valor > aleatorio ) {
			System.out.print("o Valor é menor\n");
		}else if(valor < aleatorio) {
			System.out.print("o Valor é maior\n");
		}
	}
	System.out.print(aleatorio);
 }
}
