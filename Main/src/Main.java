import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
public class Main {
	public static void main(String[] args) {
		MyFrame myWin = new MyFrame();// create/instantiate object
		myWin.setSize(300, 200);// width 200, height 300 pixels
		myWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWin.setTitle("Visage animés");
		myWin.setVisible(true);
		
	}
}

class MyFrame extends JFrame {// inheritance
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.yellow);
		g.fillOval(50, 50, 100, 100);
		g.setColor(Color.red);
		g.drawOval(50, 50, 100, 100);
		g.drawOval(70, 70, 20, 20);
		g.drawOval(110, 70, 20, 20);
		g.drawLine(100, 80, 100, 110);
		g.drawArc(75, 80, 50, 50, 240, 60);
	}
}