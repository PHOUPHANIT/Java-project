
public class Point {
	private double x;
	private double y;
	private static double eps = 1.0e-5;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setEps(double eps_in){ 
		          this.eps =  eps_in; 
		}
	public static double getEps(){ 
			return eps ; 
			}
	public boolean equal(Point p) {
				double dx  =  x - p.x;
				double dy  =  y - p.y;
				if (dx < 0) 
					dx = -dx;
				if (dy < 0) 
					dy = -dy;
				return(dx < eps &&  dy < eps );	
	}

	public static void main(String[] args) {

        Point p1 = new Point(10,14);
        Point p2 = new Point(10.0001,14.001);
        p2.setEps(1.0e-2);
		System.out.println(p1.equal(p2));
		System.out.print(p2.equals(p1));
	}

}
