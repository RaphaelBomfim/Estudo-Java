package modulo2;

public class Break2 {
  
	public static void main(String[] args) {
		
		 linha: for (int i = 0; i < 10; i++) {
			coluna: for (int j = 0; j < 10; j++) {
				 if (i == 1 )break;
				
				 System.out.printf(" [%d %d] ", i, j);
			}
		System.out.println();
		}
		
	}
	
}
