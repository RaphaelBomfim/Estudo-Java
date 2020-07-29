package Exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do Triangulo: ");
		double b = entrada.nextDouble();
		
		System.out.println("digite o valor da altura do triangulo: ");
		double h = entrada.nextDouble();
		
		double area = (b * h) / 2;
		
		System.out.printf("A area do triangulo é: %.2f", area);
		
	}
	
}
