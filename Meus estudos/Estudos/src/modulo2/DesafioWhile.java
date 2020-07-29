package modulo2;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Digite um nota ou (-1) para sair: ");
			nota =  entrada.nextDouble();
			
			if(nota <= 10 && nota >=0) {
				total += nota;
				quantidadeNotas ++;
		    }
			  else if (nota != -1) {
				System.out.println("nota invalida");
              }
			
			
			
		}
		
		// calcular média
		
					double media = total / quantidadeNotas;
					System.out.println("média é: " + media);
					
					entrada.close();	
					
					if (media <= 6.9) {
						System.out.println("Nota vermelha");

					}
					else {
						System.out.println("nota azul");
		              }
					
					
		
	}
	
}
