package primeiro;

import java.util.Scanner;

public class Relacionaigs {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Qual é a nota do aluno");
		double NotaAluno = entrada.nextDouble();
		
		System.out.println("O aluno é focado e comportado?");
		boolean Comport = entrada.hasNext();
		
		boolean Passou = NotaAluno >= 7;
		boolean desconto = Passou && Comport;
		
		System.out.println("o aluno passou? " + Passou);
		System.out.println("esse aluno tem desconto? " + desconto);
		
		
	}
	
}
