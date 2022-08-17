
public class managePoint {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 3;
		p1.y = 7;
		Point p2 = new Point(9);
		
		 // double distance = p1.distance(p2);
        double distance = Point.distance(p1, p2);
        System.out.printf("distance from p1(%d,%d) to p2(%d,%d) is %f.",
                p1.x, p1.y, p2.x, p2.y, distance);
	}
	
	


}
