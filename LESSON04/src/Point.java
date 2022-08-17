import java.awt.*;
import javax.swing.*;

public class Point {
    protected int x, y;// child classes can access   

    public Point() {
        this(0, 0);
    }

    public Point(int x) {
        this(x, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("x=%d, y=%d", x, y);
    }

    public double distanceOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}

class PointGraphic extends Point {
    java.awt.Color color;

    public PointGraphic() {
        color = Color.BLACK; // super(0, 0);// call super/parent class's constructor   
    }

    public PointGraphic(int x, int y, Color c) {
        super(x, y);
        color = c;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, 15, 15);
    }
}

class MyFrame extends JFrame {
    public MyFrame() {
        super("My Title");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        PointGraphic pg1 = new PointGraphic(20, 70, Color.BLACK);
        PointGraphic pg2 = new PointGraphic(120, 70, Color.red);
        pg1.draw(g);
        pg2.draw(g);
    }
}

class Main {
    public static void main(String[] args) {
        new MyFrame();
    }
}
