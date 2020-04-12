package classes;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	//construtor 
	Produto(String NomeInicial,double precoIni, double descontoIni){
		nome = NomeInicial;
		preco = precoIni;
		desconto = descontoIni;
		
	}
	//criando um metodo
	double precoComDesconto() {
		return (1-desconto)*preco;
	}

}
