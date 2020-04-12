package curso;

public class exrArentimetico{
    public static void main(String[] args) {
        int a = (int) Math.pow(3,3); //chave ao cubo retorna valor inteiro

        int N = (int)Math.pow(6*(3+2),2);
        N = N / (3*2);

        int M = (int)Math.pow(((1-5)*(2-7)),2);
        M = M / 2;
        int R = (int) Math.pow(10,3);
        int Y = M-N;
        Y = (int) Math.pow(Y, 3);
        Y = Y / (int) Math.pow(10,3);
        System.out.println(Y);

    }
}
