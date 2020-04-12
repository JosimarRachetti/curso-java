package curso;

import javax.swing.JOptionPane;

public class console {
    public static void main(String[] args) {
    //Wrapper - pega um tipo primitivo de dado e transforma em um semi objeto
        byte b = 100;
        Short s = 1000;
        Integer i = 1234;
        Long l = 1000L;
        //com isso é possível usar metodos que são usado com objetos

        i.compareTo(123);

        //para converter valores primitivos
        //quando o valor for menor do que o suportado pelo type ele sera trucado/cortado podendo gerar erros
        
        double a = 1;
        float bb = (float)a;
        int c = (int)a;

        //conversão de string para numeros
        Integer numero = 1000;
        //System.out.println(numero.toString().length());
        int numero2 = 123;
        //System.out.println(Integer.toString(numero2).length());

        String palavranumero = JOptionPane.showInputDialog("Digite um número:");
        System.out.println(palavranumero);
        int numpala = Integer.parseInt(palavranumero);
        System.out.println(numpala+1);

    }
}
