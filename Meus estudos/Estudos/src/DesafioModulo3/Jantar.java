package DesafioModulo3;

import java.util.Scanner;

public class Jantar {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	Pessoa p1 = new Pessoa("Raphael", 94.5);
	Pessoa p2 = new Pessoa("Natalha", 65.4);
	
	Comida c1 = new Comida("Feij�o", 0.300);
	Comida c2 = new Comida("Arroz", 0.400);
	Comida c3 = new Comida("Carne", 0.200);
	String pesquisa, comida, nome = null;
	

 
	System.out.println("Boa noite, gostaria de fazer um pedido?");
	pesquisa = entrada.next();
	int cont = 0;
	while (pesquisa.equalsIgnoreCase("sim")) {
		if (cont == 0) {
			System.out.println("Informe seu nome? ");
			nome = entrada.next();
			cont++;
		}
		System.out.println("o que gostaria de comer? ");
		comida = entrada.next();
		
		if (nome.equalsIgnoreCase("raphael")) {
			
			if (comida.equalsIgnoreCase("arroz")) {
				p1.comer(c2);
					
				
			} else if (comida.equalsIgnoreCase("Feij�o")) {
				p1.comer(c2);
				
				
			} else {
				p1.comer(c2);
			}
			System.out.println(p1.peso);
				
		} else if (pesquisa.equalsIgnoreCase("nathalia")) {
				System.out.println("o que quer comer?");
				
				if (comida.equalsIgnoreCase("arroz")) {
					p2.comer(c2);
					
					
				} else if (comida.equalsIgnoreCase("Feij�o")) {
					p2.comer(c2);
					
					
				} else {
					p2.comer(c2);
				}
				System.out.println(p2.peso);
				
		} 
	
		

	
	
		System.out.println("deseja fazer um novo pedido? ");
		pesquisa = entrada.next();
		
	}	
}	
}
