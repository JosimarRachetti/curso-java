package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();
        //add retorna um booleano, push retorna um exception caso nao consiga add
        livros.add("O pequeno principe");
        livros.push("Dom quixote");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        //remove da pilha
        // pop e remove retorna exceção em caso de pilha vazia e poll retorna boleano falso
        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop());

        //outros metodos
        livros.size();
        livros.clear();
        livros.isEmpty();
    }
}
