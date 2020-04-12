package curso;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Uri {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    	Locale l = new Locale("pt","BR");
    	double v = 45.698;
    	double y = 234.345;
    	
    	System.out.printf("%.6f - %.6f\n",y,v);
    	System.out.printf("%.0f - %.0f\n",y,v);
    	System.out.printf("%.1f - %.1f\n",y,v);
    	System.out.printf("%.1f4 - %.2f\n",y,v);
    	System.out.printf("%.3f - %.3f\n",y,v);
    	System.out.printf("%.6e - %.6e\n",y,v);
    	System.out.printf("%.6E - %.6E\n",y,v);
    	System.out.printf("%.3f - %.3f\n",y,v);
    	System.out.printf("%.3f - %.3f\n",y,v);

}}
