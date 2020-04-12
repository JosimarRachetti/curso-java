package curso;

public class tipoString  {
    public static void main(String[] args) {
        System.out.println("Tipo String".charAt(2)); //COM CHARAT retorna o caractere do indice entre parenteses

        String s = "BOA TARDE";
        System.out.println(s.concat(" para todos")); //concatena uma string
        System.out.println(s +"!!!");

        System.out.println(s.startsWith("BOA"));
        //Confere se a primeira palavra da string é igual a informada e retorna true ou false
        //com endswith é o mesmo processo porem checa a palavra final da string
        System.out.println(s.endsWith("TARDE"));

        System.out.println(s.length()); //retorna um inteiro que é o tamanho da string

        System.out.println(s.equals("boa tarde"));
        //compara duas strings e retorna true ou false. não ignora diferenças de maiusculas e minusculas
        //equalsIgnoreCase ignora diferenças de minusculas e maiusculas
         System.out.println(s.equalsIgnoreCase("boa tarde"));

         var nome = "Bill";
         var sobrenome = "Gates";
         var empresa = "Microsoft";

         var frase = nome +" "+ sobrenome +" empresa: "+empresa;
         System.out.printf("Nome: %s Sobrenome: %s", nome,sobrenome);
         System.out.println(frase);

         //Comparação de strings iguais
        String n2 = "josimar";


    }
}
