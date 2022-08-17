
import java.util.*;
public class TP2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x,y;
		

		System.out.print("Please input width (in meter): ");
		x = sc.nextDouble();
		System.out.print("Please input height (in meter): ");
		y = sc.nextDouble();
		
		double p,s;
		
		p = (x+y)*2;
		s = x*y;
		
		System.out.print("Perimeter: ("+x+" + "+y+")*2"+" = "+p+" m");
		System.out.print("\nSurface: "+x+" x "+y+" = "+s+" m^2");
		
		sc.close();
		
	}

}
