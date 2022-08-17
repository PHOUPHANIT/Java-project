import java.util.*;
public class TP04_5_MaxNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] number = new int[8];
		
		for(int i=0;i<8;i++) {
			System.out.printf("Enter the number%d: ",i+1);
			 number[i] = sc.nextInt();
		}
		int max = number[0];
		for(int i=0;i<8;i++) {
			if(max<number[i]) {
				max = number[i];
			}
		}
		
		System.out.print("The largest number is "+max);
		
		sc.close();
		
	}

}
