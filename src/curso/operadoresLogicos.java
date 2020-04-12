package curso;

public class operadoresLogicos {
    public static void main(String[] args) {
        //Os operadores lógicos
        //ou ||
        //e &&
        //não !
        //xor ^


        //exercicio
        boolean trabalho1=true;
        boolean trabalho2=false;
        if(trabalho1 || trabalho2){
            if(trabalho1 && trabalho2){
                System.out.println("Compraram TV de 50 e tomaram sorvete");
            }else{
                System.out.println("Compraram TV de 32 e tomaram sorvete");
            }
        }else{
            System.out.println("Não Compraram a tv e não tomaram sorvete");
        }

        //operação ternária
        int idade = 23;
        String resultado = idade >= 18 ? "maior de idade":"menor de idade";
        System.out.println(resultado);
    }
}
