import java.util.Scanner;
import static java.lang.Integer.parseInt;
public class ObligO3 {

	public static void main(String[] args) {
		// n>0 n! n=(n-1)*n
		Scanner input = new Scanner(System.in);
		
		System.out.println("Velg en N");
		double n = parseInt(input.nextLine());
		
		double resultat = 1;
		while (n>0) {
			resultat *=n;
			n--;
			
		}
			System.out.println("Resultat: ");
			System.out.println(resultat);	
	}
	
}