package classes;

public class ValorNulo {
    public static void main(String[] args) {
        String S1 = "";
        System.out.println(S1.concat("!!!!!"));
        //o valor nulo é atribuido a uma variavel q nao aponta para nenhum local de memoria
        String S2=null;
        System.out.println(S2.concat("????"));
    }
}
