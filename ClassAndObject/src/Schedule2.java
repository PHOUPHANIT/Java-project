import java.util.Date;
import java.util.Calendar;

public class Schedule2 {
        static Date now;
        static Date tomorrow;
        static Date yesterday;
        static {//static initializer
             Calendar c = Calendar.getInstance();
             now = c.getTime();

             c.add(Calendar.DAY_OF_MONTH, 1);
             tomorrow = c.getTime();

             c.add(Calendar.DAY_OF_MONTH, -2);
             yesterday = c.getTime();
        }
        public static void main(String[] args) {
        	System.out.println(Schedule.now);
        	System.out.println(Schedule.tomorrow);
        	System.out.println(Schedule.yesterday);
        }
}