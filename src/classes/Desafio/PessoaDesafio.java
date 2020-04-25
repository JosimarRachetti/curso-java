package classes.Desafio;

public class PessoaDesafio {
    String nome;
    int idade;
    double peso;
    PessoaDesafio(String Nome, int Idade,double Peso){
        nome = Nome;
        idade = Idade;
        peso = Peso;
    }
    double jantou(double x){
        this.peso = this.peso+x;
        return this.peso;
    }


}
