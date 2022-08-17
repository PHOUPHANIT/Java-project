
public class Point {
	
	int x;
	int y;
	
	public Point() {
		x=y=0;  // defualt
	}
	
	public Point(int X) {
		this(X,0);//contructor delegation
	/*	x = X;
		y= 0;*/
	}
//	public Point(int X,int Y) {
//		x = X;
//		y= Y;
//	}
//	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}// Accept attibute x , y 
	
    // class method
    public static double distance(Point p1, Point p2) {
        return p1.distance(p2);
    }

    public double distance(Point p2) {
        return Math.sqrt(
                Math.pow(p2.x - this.x, 2) +
                        Math.pow(p2.y + this.y, 2));
    }
}

