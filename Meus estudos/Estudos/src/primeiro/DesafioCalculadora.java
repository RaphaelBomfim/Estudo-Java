package primeiro;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite um Numero: ");
		double num1 = entrada.nextDouble();
		System.out.print("\ndigite o segundo numero: ");
		double num2  = entrada.nextDouble();
		
		System.out.print("Qual operação você vai ultilizar?");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : "-".equals(op) ? num1 - num2 : "/".equals(op) ? num1 / num2 : "*".equals(op) ? num1 * num2 : 0;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

		entrada.close();
	
	}	
	
}
