package modulo2;

public class Continue {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i ++) {
			if (i % 2 == 1) continue;
		
			System.out.println(i);
	    }
		  System.out.println("");
		for(int i = 1; i <= 10; i++ ) {
			if(i == 5) continue;
			else if(i ==6) continue;
			System.out.println(i);
		}
	}
}
