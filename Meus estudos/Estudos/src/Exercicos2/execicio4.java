package Exercicos2;

import java.util.Scanner;

public class execicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um Numero para confirma se ele é primo ou não :");
		int primo = entrada.nextInt();

		int primo1 = primo % 2;
		int primo2 = primo % 3;
		int primo3 = primo % 5;

		if (primo1 != 0) {
			if (primo2 != 0) {
				if (primo3 != 0) {
					System.out.println("o numero " + primo + " é primo");
				}
			}
		} else {
			System.out.println("O numero " + primo + " não é primo");
		}

	}

}
