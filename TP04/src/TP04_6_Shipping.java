import java.util.*;
public class TP04_6_Shipping {
	
	double distanceAtoB, distanceBtoC;
	double weight;
	double liteAtoB,liteBtoC,liteMin,liteC;

	public TP04_6_Shipping (int AB, int BC, double Weight) {
		this.distanceAtoB = AB;
		this.distanceBtoC = BC;
		this.weight = Weight;	
	}
	
	public void processData() {
		
		double liteAtoB = distanceAtoB*liteC;
		double liteBtoC = distanceBtoC*liteC;
		
		if(liteAtoB<5000) {
			double liteInAB = 5000 - liteAtoB;
			if(liteBtoC<=5000 && liteBtoC>=liteInAB) {
				liteMin = liteBtoC - liteInAB;
				System.out.print("\nMinimum petrol to fill for reach C is: "+liteMin +" L");
			}else if(liteBtoC<=5000 && liteBtoC<liteInAB) {
				System.out.print("""
						\nNo need to fill the Petrol to reach point C
						Will automatically reach to point C.
						""");
				liteMin = liteInAB - liteBtoC ;
				System.out.print("\nRemaining petrol is: "+liteMin+" L");
			}else if(liteBtoC>5000) {
				System.out.print("\nCannot reach to point C.");
			}else {
				System.out.print("\nCannot reach to point B.");
			}
		}
	}
	
	public void checkLite() {
		if(weight>0 && weight<=5000) {
			liteC = 10;
		}else if(weight>5000 && weight<=10000) {
			liteC = 20;
		}else if(weight>10000 && weight<=20000) {
			liteC = 25;
		}else if (weight>20000 && weight<=30000) {
			liteC = 35;
		} processData();
	}
	public void checkWeight() {
		if(weight>0 && weight<=30000) {	
			checkLite();
		}else {
			System.out.print("\nShip can't load!");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		     System.out.print("\n\nInput distance A to B (km): ");
		     int disAtoB = sc.nextInt();
		     System.out.print("Input distance B to C (km): ");
		     int disBtoC = sc.nextInt();
		     System.out.print("Input weight of good (kg): ");
		     double goods = sc.nextDouble();
	       	TP04_6_Shipping s = new TP04_6_Shipping(disAtoB,disBtoC,goods);
	     	s.checkWeight();
	     	sc.close();
		}
		
	}

}
