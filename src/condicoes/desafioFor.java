package condicoes;

public class desafioFor {
    public static void main(String[] args) {
        // rodar um for sem informar numeros
        String valor= "#";

        for(int i="#".length();i<="#####".length();i++){
            System.out.println(valor);
            valor+="#";
        }

        //solução dois

        for(String v="#";!v.equals("######");v+="#"){
            System.out.println(v);
        }
    }
}
