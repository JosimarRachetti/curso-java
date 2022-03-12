package classes;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        u1.nome = "josimar";
        u2.nome = "josimar";
        u1.email = "teste@teste";
        u2.email = "teste@teste";
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));


    }
}
