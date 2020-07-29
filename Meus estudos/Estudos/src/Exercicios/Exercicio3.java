package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor a ser Elevado ao quadrado e ao cubo: ");
				double Valor = entrada.nextDouble();
				
				
			double quadrado = Math.pow(Valor, 2);
			double cubo = Math.pow(Valor, 3);
			
			System.out.printf("O valor de %.2f ao quadrado é: %.2f , e ao cubo é %.2f ", Valor, quadrado, cubo);
		
		
	}
	
}
