package Classe;

public class Area {

	double raio;
	static double pi = 3.14;
	
	Area(double AreaInicial) {
		raio= AreaInicial;
		
	} 
	
	double AreaCirc() {
		return pi * (Math.pow(raio, 2));
		
	}
	
	
	
	
}
