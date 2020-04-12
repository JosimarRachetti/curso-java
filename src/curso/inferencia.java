package curso;

public class inferencia {
    public static void main(String[] args) {
// O java vai automaticamente definir o tipo da variavel pelo seu valor
        var inteiro = 4;
        var real = 23.4;
        var palavra = "Josimar";

        System.out.println(inteiro);
        System.out.println(real);
        System.out.println(palavra);
// Tipo premitivos em Java  são 8 tipos
//  sendo seis tipos primitivos numérico
//  sendo: byte = 1b ; short = 2b; int = 4b; long = 8b;
//   float: 4b; double = 8b;
//  os outros dois tipos são:
//  char  e boolean
//        exemplo dados de um funcionario
        byte anosDeEmpresa = 10;
        short projetosEnvolvidos = 602;
        int id = 83984;
        long redeAlcance = 3_444_555_666L; //PARA LONG É NECESSARIO O L NO FINAL

        float salario = 6.789F; //PARA FLOAT É NECESSARIO O F NO FINAL
        double lucroGerado = 1_999.999;

        boolean estaNaEmpresa = true;
        char codigoSetor = 'A';
    }
}
