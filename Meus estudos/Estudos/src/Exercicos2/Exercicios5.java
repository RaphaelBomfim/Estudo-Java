package Exercicos2;

import java.util.Scanner;

public class Exercicios5 {
	public static void main(String[] args) {
	

		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = 3;

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		case 1:
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}

		scanner.close();

	}
}