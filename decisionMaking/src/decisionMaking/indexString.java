package decisionMaking;

import java.util.*;

public class indexString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner Input = new Scanner(System.in)){
			System.out.print("Enter your sentences: ");
			String Word = Input.nextLine();
			System.out.print("Enter your character you check: ");
			char checkCh = Input.next().charAt(0);
			
			int counter = 0;
			int startFrom = 0;
			
			
			for(;;) {
				
				int index = Word.indexOf(checkCh,startFrom);
				
				if(index>=0) {
					counter =  counter + 1;
					startFrom = index + 1;
				}else {
					break;
				}
			}
	     
			System.out.println("\nThe sentences: "+Word);
			System.out.println("\n\nThe \'"+checkCh+"\' character has come "+counter+" times.");
			
			Input.close();
		}
		
	
//		int a = 
//		System.out.println(Math.sqrt(a));
	
	}

}
