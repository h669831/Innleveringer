import java.io.InputStream;
import java.util.Scanner;

public class OppgaveG4 {

	public static void main(String[] args) {
		
		System.out.println("Skriv inn din Bruttoinntekt");
		
		Scanner scanner =  new Scanner(System.in);
				int brutto = scanner.nextInt();

        double kvote1Skatt = 0.0,
                kvote2Skatt = 0.0,
                kvote3Skatt = 0.0,
                kvote4Skatt = 0.0;

		if (brutto > 934051) {
            kvote4Skatt = (brutto-934051)*0.1452;
            kvote3Skatt = (934050-580651)*0.1152;
            kvote2Skatt = (580650-230951)*0.0241;
            kvote1Skatt = (230950-164101)*0.0093;
        }
        else if (brutto > 580651) {
            kvote3Skatt = (brutto-580651)*0.1152;
            kvote2Skatt = (580650-230951)*0.0241;
            kvote1Skatt = (230950-164101)*0.0093;
        }
        else if (brutto > 230951) {
            kvote2Skatt = (brutto-230951)*0.0241;
            kvote1Skatt = (230950-164101)*0.0093;
        }
        else if (brutto > 164101) { 
            kvote1Skatt = (brutto-164101)*0.0093;
        }

        System.out.println(
                "Med en inntekt på: " + brutto + "kr\n" +
                "Betaler du: \n " +
                kvote4Skatt + "kr i skatt på trinn 4,\n"+
                kvote3Skatt + "kr i skatt på trinn 3,\n"+
                kvote2Skatt + "kr i skatt på trinn 2,\n"+
                kvote1Skatt + "kr i skatt på trinn 1,\n\n"+
                "Totalt: " + (kvote4Skatt + kvote3Skatt + kvote2Skatt + kvote1Skatt) + "kr");

    
	}

}