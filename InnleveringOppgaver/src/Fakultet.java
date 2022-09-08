 
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
 
public class Fakultet {
 
  public static void main(String[] args) {
    
    int n;
    
          String tallTxt = showInputDialog("Gi n =");
          n = parseInt(tallTxt);} 
  
    public static int fakultet(int maxTall, char[] n) {
        int nFak = 1;
        for (int tall=1; tall<=maxTall; tall++)
          nFak = nFak * tall;
        return nFak;
  System.out.print(nFak);
  }
}