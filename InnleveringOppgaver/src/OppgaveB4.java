import java.util.Scanner;

public class OppgaveB4 {

	public static void main(String[] args) {
		
		Scanner showInputDialog = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			int poengsum = showInputDialog.nextInt();
					
			String karakter = "Ugyldig Poengsum";
			
			if (poengsum <=39)
				karakter = "F";
			
			if (poengsum >= 40 && poengsum <=49)
				karakter = "E";
			
			if (poengsum >= 50 && poengsum <=59)
				karakter = "D";
			
			if (poengsum >= 60 && poengsum <=79)
				karakter = "C";
			
			if (poengsum >= 80 && poengsum <=89)
				karakter = "B";
			
			if (poengsum >=90 && poengsum <=100)
				karakter = "A";
			
			if ((karakter).equals("Ugyldig Poengsum")) {
				System.out.println("Ugyldig Poengsum, prøv igjen");
				--i;
				continue;
			}
				
			System.out.println("Karakteren din ble: "+karakter);
		}
	
	}
}
