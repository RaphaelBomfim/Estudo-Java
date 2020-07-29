package primeiro;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
       double A = 6*(3+2);
       double powerA = Math.pow(A,2);
       double B = powerA / (3*2);
       
       double A1 = ((1-5) * (2-7)) / 2 ;
       double powerA1 = Math.pow(A1, 2);
       
       double A2 = B - powerA1;
       	double powerA2 = Math.pow(A2, 3);	   
       	double C = 10;
       double powerC = Math.pow(C, 3);
    
       double resultado = powerA2 / powerC;       
       
		
		
		System.out.println(resultado);
	}
	
}
