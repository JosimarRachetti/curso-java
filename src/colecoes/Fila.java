package colecoes;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        //criando um fila de string
        Queue <String> fila = new LinkedList<>();

        // o add e offer adiciona valores a fila, porém o offer retorna falso
        // quando está cheia, já o add retorna um exceção
        fila.add("primeiro valor");
        fila.offer("segundo valor");

        //os dois retornam o valor sem remover o valor
        // peek retorna null para uma lista vazia e o element retorna exceção
        System.out.println(fila.peek());
        System.out.println(fila.element());

        //metodos para fila
        //fila.size(); tamanho da fila
        //fila.clear(); limpar fila
        //fila.isEmpty(); verificar se fila vazia

        //retorna o elemento da fila e remove da fila,
        //se fila vazia retorna null
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        //retorna o elemento e remove, porem em caso de fila vaiza retorna exceção
        System.out.println(fila.remove());
    }
}
