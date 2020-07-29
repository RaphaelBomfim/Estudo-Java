package modulo2;

import java.util.Scanner;

public class Swicth2 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		System.out.println("digite a nota :");
		int notas = entrada.nextInt();
	
		switch(notas) {  
			case 10: case 9:
				conceito = "A";
				break;
			case 8: case 7:
				conceito = "B";
				break;
			case 6: case 5:
				conceito = "C";
				break;
			case 4: case 3:
				conceito = "D";
				break;
			case 2: case 1: case 0:
				conceito = "E";
				break;
				default: conceito = "nota invalida";
		
	    }
				
		System.out.println("conceito é: " + conceito);
		entrada.close();
	}
}
