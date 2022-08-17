import java.util.Date;
import java.util.Calendar;
public class Schedule {
	
		static Date now = new Date();
		static Date tomorrow;
		static Date yesterday;
		static {//static initializer
		       tomorrow = new Date(now.getTime() + (24 * 60 * 60 * 1000));
		      yesterday = new Date(now.getTime() - (24 * 60 * 60 * 1000));
		}

    
    
		public static void main(String[] args) {
			System.out.println(Schedule.now);
			System.out.println(Schedule.tomorrow);
			System.out.println(Schedule.yesterday);
	    }

}
