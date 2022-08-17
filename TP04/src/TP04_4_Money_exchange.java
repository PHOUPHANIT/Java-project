import java.util.*;
public class TP04_4_Money_exchange {
	
	Scanner sc = new Scanner(System.in);
	public void ReilToDollar() {
		 System.out.print("\nInput money in Reil: ");
		 double money = sc.nextDouble();
		 double dollar = money / 4000;
		 System.out.println("\n"+money+" REILS = "+dollar+" USD\n");
	}
	public void ReilToBaht() {
		System.out.print("\nInput money in Reil: ");
		double money = sc.nextDouble();
		double baht = (money*30)/4000;
		System.out.println("\n"+money+" REILS = "+baht+" BAHT\n");
	}
	
	public void DollarToReil() {
		System.out.print("\nInput money in Dollar: ");
		double money = sc.nextDouble();
		double reil = money * 4000;
		System.out.printf("\n%.2f USD = % .2f REILS\n",money,reil);
	}
	
	public void DollarToBaht() {
		System.out.print("\nInput money in Dollar: ");
		double money = sc.nextDouble();
		double baht = 30*money;
		System.out.println("\n"+money+" USD = "+baht+" BAHT\n");
	}
	public void BahtToReil() {
		System.out.print("\nInput money in Baht: ");
		double money = sc.nextDouble();
		double reil = (money*4000)/30;
		System.out.printf("\n%.2f BAHT = % .2f REILS\n",money,reil);
		
	}

	public static void main(String[] args) {
		
		TP04_4_Money_exchange me = new TP04_4_Money_exchange();
		
	    while(true) {
		System.out.print("""
\nWelcome to program Money Exchanges!
 1. Riels to Dollar
 2. Riels to Thai Baht
 3. Dollar to Riels
 4. Dollar to Thai Baht
 5. Thai Baht to Riels
 6. Exit
Choose an option:
				""");

		   int option = me.sc.nextInt();	
			switch(option) {
			case 1:
				me.ReilToDollar();
				break;
			case 2:
				me.ReilToBaht();
				break;
			case 3:
				me.DollarToReil();
				break;
			case 4:
				me.DollarToBaht();
				break;
			case 5:
				me.BahtToReil();
				break;
			default:
				break;
				
				
			}

		}

	}

}
