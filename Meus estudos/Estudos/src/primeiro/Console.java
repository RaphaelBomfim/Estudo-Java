package primeiro;

import java.util.Scanner;

public class Console {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in); 
	
	System.out.println("Digite o Primeiro salario: ");
	String salario1 = entrada.next().replace(",", ".");
	
	System.out.println("Digite o segundo salario: ");
	String salario2 = entrada.next().replace(",", ".");
	
	System.out.println("Digite o terceiro salario: ");
	String salario3 = entrada.next().replace(",", ".");
	
	  double numeroConvertido1 = Double.parseDouble(salario1);
	  double numeroConvertido2 = Double.parseDouble(salario2);
	  double numeroConvertido3 = Double.parseDouble(salario3);
	  
	  double soma = numeroConvertido1 + numeroConvertido2 + numeroConvertido3;
	  
	  
	  System.out.println(soma);
	  
	  
	  entrada.close();
	
	
	

	
	
	
}
}
