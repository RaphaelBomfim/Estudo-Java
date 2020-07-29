package Exercicos2;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite a nota do aluno: ");
		Double nota1 = entrada.nextDouble();
		
		System.out.println("digite a segunda nota do aluno: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println(media);
		
		if (media >=7 && media <=10) {
			   System.out.printf("Aprovado");
		}	   
			   else if(media >= 4 && media <= 6.9) {
				   System.out.println("Recuperação");
			   }
		
			   else if(media >=0 && media <= 3 ) {
				   System.out.println("Reprovado");
			   }
			   else {
				   System.out.println("nota invalida");
			   }
			
}
}
