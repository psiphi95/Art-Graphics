/*
Daniel Hsu
CSE 142 AI 
TA=Rebecca Yuen
4-15-15
HW 3A

Creates a rocket launcher!
*/
import java.awt.*;

public class Doodle {
   public static void main(String[] args) {
      DrawingPanel panel = new DrawingPanel(1250, 500);
      panel.setBackground(Color.BLACK);
      Graphics g = panel.getGraphics();
      drawLauncher(g, 50, 250, 10);
      drawRocket(g, 50, 250, 10);

      for (int i=1; i<=200; i++) {
         drawLauncher(g, -200+10*i, 350, 10);
         drawRocket(g, -200+20*i, 350-2*i, 10);
         panel.sleep(10);
         panel.clear();
      }
   }
   
    public static void drawRocket(Graphics g, int x, int y, int size) {   
      g.setColor(Color.LIGHT_GRAY);
      Polygon trapz1 = new Polygon(); 
      trapz1.addPoint(x+210, y-90); 
      trapz1.addPoint(x+200, y-120); 
      trapz1.addPoint(x+250, y-135); 
      trapz1.addPoint(x+260, y-105);
      g.fillPolygon(trapz1);
      Polygon tri1 = new Polygon(); 
      tri1.addPoint(x+260, y-105); 
      tri1.addPoint(x+250, y-135); 
      tri1.addPoint(x+300, y-135); 
      g.fillPolygon(tri1);
      
      g.setColor(Color.DARK_GRAY);
      Polygon trapz2 = new Polygon(); 
      trapz2.addPoint(x+210, y-90); 
      trapz2.addPoint(x+200, y-120); 
      trapz2.addPoint(x+250, y-135); 
      trapz2.addPoint(x+260, y-105);
      g.drawPolygon(trapz2);
      Polygon tri2 = new Polygon(); 
      tri2.addPoint(x+260, y-105); 
      tri2.addPoint(x+250, y-135); 
      tri2.addPoint(x+300, y-135); 
      g.drawPolygon(tri2);
      }
      
   public static void drawLauncher(Graphics g, int x, int y, int size) {
      g.setColor(Color.GREEN);
      g.fillRect(x, y, 300, 30);
	   g.fillRect(x+230, y-20, 70, 20);
      g.fillRect(x+230, y-60, 40, 40);
      g.fillOval(x+120, y-10, 50, 25);
      g.fillOval(x-5, y-10, 20, 20);
      Polygon rhom = new Polygon(); 
      rhom.addPoint(x+140, y); 
      rhom.addPoint(x+125, y-50); 
      rhom.addPoint(x+135, y-50); 
      rhom.addPoint(x+150, y);
      g.fillPolygon(rhom);
      Polygon para = new Polygon(); 
      para.addPoint(x, y); 
      para.addPoint(x-20, y-60); 
      para.addPoint(x+190, y-130); 
      para.addPoint(x+210, y-70);
      g.fillPolygon(para);

      g.setColor(Color.BLUE);
      Polygon tri1 = new Polygon(); 
      tri1.addPoint(x+270, y-60); 
      tri1.addPoint(x+270, y-20); 
      tri1.addPoint(x+300, y-20); 
      g.fillPolygon(tri1);
      
      g.setColor(Color.DARK_GRAY);
      g.fillOval(x+10, y+10, 40, 40);
      g.fillOval(x+60, y+10, 40, 40);
      g.fillOval(x+240, y+10, 40, 40);
      
      g.setColor(Color.LIGHT_GRAY);
      g.fillOval(x+20, y+20, 20, 20);
      g.fillOval(x+70, y+20, 20, 20);
      g.fillOval(x+250, y+20, 20, 20);
      g.fillOval(x-2, y-7, 15, 15);
      g.drawOval(x-5, y-10, 20, 20);
      Polygon tri2 = new Polygon(); 
      tri2.addPoint(x+270, y-60); 
      tri2.addPoint(x+270, y-20); 
      tri2.addPoint(x+300, y-20); 
      g.drawPolygon(tri2);
   }
}
