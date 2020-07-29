package primeiro;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean ComprouTV32 = trabalho1 ^ trabalho2;
		
		System.out.println("trabalhei os dois dias? "  +  comprouTV50 );
		System.out.println("Comprei TV de 32 " + ComprouTV32);
		System.out.println();
		System.out.println();
		
	}
	
}