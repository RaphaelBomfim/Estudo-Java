package Exercicios;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		double a = entrada.nextDouble();
		
		System.out.println("Digite o valor de B:");
		double b =entrada.nextDouble();
		
		System.out.println("Digite o valor de C:");	
		double c = entrada.nextDouble();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		System.out.println("o delta é " + delta);
		
		
	}

}
