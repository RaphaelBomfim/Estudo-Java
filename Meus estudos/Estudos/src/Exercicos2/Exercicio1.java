package Exercicos2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um Numero");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0){
			if(numero >= 0 && numero <= 10){
				System.out.printf("O numero � " + numero + " e ele � par");}
		
			else {
				System.out.printf("O numero � " + numero + " e ele n�o � par");}
}	
		
		else {
			System.out.printf("O numero � " + numero + " n�o esta entre 0 e 10");}
		
			
			
	   
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
