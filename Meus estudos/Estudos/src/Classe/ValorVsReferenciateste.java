package Classe;

public class ValorVsReferenciateste {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)
		 a++;
		 b--;
		 
		 System.out.println(a + " " + b);
		 
		 Data d1 = new Data();
		 Data d2 = d1; // Atribuição por refencia (Objeto)
		
	
		
		System.out.println(d1.DataFormatada());
		System.out.println(d2.DataFormatada());
		
		
		d1.VoltardataPadrao(d2);
		
		System.out.println(d1);
		System.out.println(d2);
		
			
			
		}
		
		
	}
	
	
	

