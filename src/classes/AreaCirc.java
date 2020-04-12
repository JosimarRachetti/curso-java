package classes;

public class AreaCirc {
	double raio;
	// static define que essa variavel ou metodo será igual para todos as instancias
	// o final irá tornar a varivel uma constante 
	static final double pi=3.14;
	
	AreaCirc(double raioInicial){
		raio=raioInicial;
	}
	
	double area() {
		return pi*Math.pow(raio, 2);
	}

}
