package Exercicos2;

import java.util.Random;
import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;

		do {
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Começou o jogo! Sera que consegue me vencer?");
			tentativas = 0;

			do {
				
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = entrada.nextInt();
				
				if (numero > numeroSorteado) {
					System.out.printf("O numero sorteado é menor que %d", numero );
				}
				else if (numero < numeroSorteado) {
					System.out.printf("O numero sorteado é maior que %d", numero );
				}
				else {
					System.out.printf("Parabéns, você conseguiu! O numero sorteado é: %d ", numeroSorteado);	
				}

		} while (numero != numeroSorteado); 
			System.out.println("Digite 0 para sair ou qualquer outro numero para continuar!!");
		    continuar = entrada.hashCode();			
		    
			
			
			} while (continuar == 0);
	
				entrada.close();
	
		
}
}
