package primeiro;

import java.util.Scanner;

public class Relacionais2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("qual � a m�dia do aluno?"  );
		double MediaAluno = entrada.nextDouble();
	
		String Recupera��o = MediaAluno >= 5 ? "em Recupera��o" : "Reprovado";
		String Resultado = MediaAluno >= 7 ? "Aprovado" : Recupera��o;
		String Desconto = MediaAluno >= 6 ? "tem desconto" : "N�o tem desconto";
				
		System.out.println("O aluno est�: " + Resultado);
		System.out.println("O aluno tem desconto? " + Desconto);
		
		
		
		
	}

}
