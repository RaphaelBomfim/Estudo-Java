package modulo2;

import java.util.Scanner;

public class desafioIF {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um dia da semana:");
		String dia = entrada.next();

		
		if (("DOMINGO").equalsIgnoreCase(dia)){ 
		System.out.printf("%s � o Primeiro(1) dia da semana", dia);
		}	
		else if(("SEGUNDA").equalsIgnoreCase(dia)) {
			System.out.printf("%s � o segundo(2) dia da semana", dia);	
		}
		else if(("TER�A").equalsIgnoreCase(dia)) {
			System.out.printf("%s � o terceiro(3) dia da semana", dia);	
			}
		else if(("QUARTA").equalsIgnoreCase(dia)) {
			System.out.printf("%s � o quarto(4) dia da semana", dia);	
			}
		else if(("QUINTA").equalsIgnoreCase(dia)) {
			System.out.printf("%s � o quinto(5) dia da semana", dia);	
			}
		else if(("SEXTA").equalsIgnoreCase(dia)) {
			System.out.printf("%s � o sexto(6) dia da semana", dia);	
			}
		else if(("SABADO").equalsIgnoreCase(dia)) {
			System.out.printf("%s � o s�timo(7) dia da semana", dia);	
			}
		else {
		    System.out.println("Dia invalido!");
		
		}
		entrada.close();
}

}
