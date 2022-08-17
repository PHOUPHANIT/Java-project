import java.util.*;
public class Exercise1 {
	public static void isPrime(int i) {
  
		int flag=0;
		if(i<=1) {
			System.out.print(i+" is not Prime number.");
		}else {
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					System.out.print(i+" is not Prime number.");
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.print(i+" is Prime number.");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number to check prime number: ");
		int num = sc.nextInt();
		
		isPrime(num);
	 
	}

}
