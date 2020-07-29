package Exercicos2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um Numero");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0){
			if(numero >= 0 && numero <= 10){
				System.out.printf("O numero é " + numero + " e ele é par");}
		
			else {
				System.out.printf("O numero é " + numero + " e ele não é par");}
}	
		
		else {
			System.out.printf("O numero é " + numero + " não esta entre 0 e 10");}
		
			
			
	   
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
