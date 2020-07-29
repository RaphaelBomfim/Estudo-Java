package primeiro;

import java.util.Scanner;

public class Relacionais2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("qual é a média do aluno?"  );
		double MediaAluno = entrada.nextDouble();
	
		String Recuperação = MediaAluno >= 5 ? "em Recuperação" : "Reprovado";
		String Resultado = MediaAluno >= 7 ? "Aprovado" : Recuperação;
		String Desconto = MediaAluno >= 6 ? "tem desconto" : "Não tem desconto";
				
		System.out.println("O aluno está: " + Resultado);
		System.out.println("O aluno tem desconto? " + Desconto);
		
		
		
		
	}

}
