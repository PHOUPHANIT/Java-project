package SumNumArray;
import java.util.Scanner;
public class sumNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try(Scanner input = new Scanner(System.in)){
        	  
        	  int[] num = new int[10];
        	  
        	  for(int i=0;i<10;i++){
        		  num[i] = input.nextInt();
        	  }
        	  
        	  int max = num[0];
        	  
        	  for(int i=0;i<10;i++){
        		  System.out.print(num[i]+" ");
        		  if(max<num[i]) {
        			  max = num[i];
        		  }
        		  if(num[i]%2==0) {
        			  System.out.print("\nThe maximun number is: "+num[i]);
        		  }
        	  }
        	  
        	  System.out.print("\nThe maximun number is: "+max);
        	  
        	  input.close();
          }
	}

}
