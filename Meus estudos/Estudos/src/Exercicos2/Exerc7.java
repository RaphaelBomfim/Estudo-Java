package Exercicos2;

import java.util.Scanner;

public class Exerc7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int soma = 0;
		int cont;
		
		do {
			 System.out.println("Somando numeros!! digere numeros a ser somados(POSITIVOS");
			 cont = entrada.nextInt();
			 soma += cont;
			 
			
		} while (cont > 0 );
		System.out.println(soma);
	}
	
}
