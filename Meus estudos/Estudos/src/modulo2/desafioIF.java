package modulo2;

import java.util.Scanner;

public class desafioIF {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um dia da semana:");
		String dia = entrada.next();

		
		if (("DOMINGO").equalsIgnoreCase(dia)){ 
		System.out.printf("%s é o Primeiro(1) dia da semana", dia);
		}	
		else if(("SEGUNDA").equalsIgnoreCase(dia)) {
			System.out.printf("%s é o segundo(2) dia da semana", dia);	
		}
		else if(("TERÇA").equalsIgnoreCase(dia)) {
			System.out.printf("%s é o terceiro(3) dia da semana", dia);	
			}
		else if(("QUARTA").equalsIgnoreCase(dia)) {
			System.out.printf("%s é o quarto(4) dia da semana", dia);	
			}
		else if(("QUINTA").equalsIgnoreCase(dia)) {
			System.out.printf("%s é o quinto(5) dia da semana", dia);	
			}
		else if(("SEXTA").equalsIgnoreCase(dia)) {
			System.out.printf("%s é o sexto(6) dia da semana", dia);	
			}
		else if(("SABADO").equalsIgnoreCase(dia)) {
			System.out.printf("%s é o sétimo(7) dia da semana", dia);	
			}
		else {
		    System.out.println("Dia invalido!");
		
		}
		entrada.close();
}

}
