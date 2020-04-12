package classes;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		//atribuição por valor
		//b recebe uma copia do valor de a
		double a = 2;
		double b = a;
		
		//Atribuição por referencia
		//d1 aponta para um objeto atraves de um edereço 
		//ele irá passar seu endereço para d2, assim os dois irão apontar para o mesmo objeto
		
		Data d1 = new Data(14,5,1996);
		Data d2 = d1;
		
		System.out.println(d1.ObterData());
		
	}
}
