import java.util.*;
public class TP2_3 {

	public static void main(String[] args) {
		
           Scanner sc = new Scanner(System.in);
           
         
           System.out.print("Program for calculating equation 1/x = 1/y + 1/z\n");
           System.out.print("Please input y: ");
           float y = sc.nextFloat();
           System.out.print("Please input z: ");
           float z = sc.nextFloat();
           
           float x = (y*z)/(z+y);
           
           System.out.print("\nResult x = "+x);
           
           
           sc.close();
           
	}

}
