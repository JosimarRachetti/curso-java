package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new  HashSet();
        conjunto.add(1.2); //metodo para adicionar
        conjunto.add(true);
        conjunto.add("valor");

        System.out.println("Tamanho do conjunto " + conjunto.size());

        conjunto.remove("valor");

        System.out.println("Tamanho do conjunto " + conjunto.size());

        System.out.println(conjunto.contains(1.2));
        System.out.println(conjunto);

        // .addAll();  faz união entre dois conjunto
        // .retailAll(); deixa no conjunto apenas contido em outro conjunto
        // .clear(); limpa o conjunto
        
    }
}
