package Exercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("qual sua altura? ");
		String altura = entrada.nextLine().replace(",", ".");
		
		System.out.println("qual a sua massa? ");
		String massa = entrada.nextLine().replace(",", ".");
		
		double alturaConvertida = Double.parseDouble(altura);
		double massaConvertida = Double.parseDouble(massa);
		
		Double IMC = massaConvertida / (alturaConvertida * alturaConvertida);
		String teste = IMC >= 24.69 ? "você está acima do Peso." : "você está com o peso ideal.";
		
		System.out.printf("Seu IMC é: %.2f e %s" , IMC, teste);
		
	
	}	
}
