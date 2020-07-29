package Classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto () {
		 		 
	 }
	
	
	 Produto (String nomeInicial, double precoInicial) {
		 nome = nomeInicial;
		 preco = precoInicial;
		 
	 }
	  	 
	 
	 
	 
	Double PrecoComDesconto(double preco, double desconto) {
		
		return  preco - (preco * desconto);
		
	}

}
