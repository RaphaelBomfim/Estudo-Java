package modulo2;

public class swicth {

	public static void main(String[] args) {
		
		String faixa = "bramca";
		
		switch (faixa.toLowerCase()) {
        case "preta":
        	System.out.println("sei o bassai");
        case "marrom":
        	System.out.println("sei o tekki");
        case "roxa":
        	System.out.println("sei o heian");
        case "verde":
        	System.out.println("sei o heian yodan");
        case "laranja":
        	System.out.println("sei o heian naidan");
        case "amarela":
        	System.out.println("sei o heian shodan");
        case "vermelha":
        	System.out.println("sei o ");
        	break;
        	default:
        	System.out.println("sei o heian shodan");
        	
		}
		
		
	}
	
}
