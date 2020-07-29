package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite F para fahrenheit ou C para Celsius: ");
		String temp = entrada.nextLine();
		temp = temp.toUpperCase();
		
		System.out.println("Digite o valor a ser convertido: ");
		double tempera = entrada.nextDouble();
		
		double resultado = "C".equals(temp) ? tempera * 9/5 + 32 : 0;
		resultado = "F".equals(temp) ? (tempera - 32) * 5/9 : resultado;
		
		
		System.out.printf("%.2f", resultado);
		
		
	} 
	
}
