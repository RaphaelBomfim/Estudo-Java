package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 21;
	    d1.mes = 3;
	    d1.ano = 1996;
	    
	    
	    
	    Data d2 = new Data();
	    d2.dia = 07;
	    d2.mes = 9;
	    d2.ano = 1972;
	    
	    Data d3 = new Data(1,1,1970);
	    
	     Data d4 = new Data();
	    
	    System.out.println(d1.DataFormatada());
	    System.out.println(d2.DataFormatada());
	    System.out.println(d3.DataFormatada());
	    System.out.println(d4.DataFormatada());
	}
	
	
	
	
}