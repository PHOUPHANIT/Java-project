import java.util.*;
public class TP04_7_Leap_year {
	
    int year;
	public TP04_7_Leap_year(int Year) {
        this.year = Year;
	}
	
	public void isLeapYear() {
		if(year<=0) {
			System.out.print("Error message!\n");
		}else {
		      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		          System.out.println(year+" is a leap year");
		       else
		          System.out.println(year+" is not a leap year");
		}
	}
		
	public static void main(String[] args) {
	      System.out.print("Write pragram to check leap year!\n");
	      System.out.print("Enter an Year :");
	      Scanner sc = new Scanner(System.in);
	      int year = sc.nextInt();
	      TP04_7_Leap_year leapYear = new TP04_7_Leap_year(year);
	      leapYear.isLeapYear();   
	      sc.close();
		
	}

}
