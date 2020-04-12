package classes;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		//está chamando para classe testeproduto classe produto
		Produto p1 = new Produto("Smartphone",1.200,0.15);
		//p1.nome = "Smartphone"; //criando instancias 
		p1.preco = 1.220;
		p1.desconto = 0.50;
	
		System.out.print(p1.precoComDesconto());
		
	}

}
