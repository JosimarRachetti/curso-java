package classes.Desafio;

public class jantaDesafio {
    public static void main(String[] args) {
        PessoaDesafio p1 = new PessoaDesafio("Josimar",23, 64.0);
        ComidaDesafio c1 = new ComidaDesafio("Pizza",1.1,"massa");
        p1.jantou(c1.peso);
        p1.jantou(c1.peso);
        System.out.println(p1.peso);
    }
}
