package DesafioModulo3;

public class Pessoa {

	String nome;
	Double peso;
	

	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	
	
	void comer(Comida Comida) {
		 if(Comida != null) {
			 this.peso += Comida.peso;
			
		} 
		 
		
		
		
	}
	
}