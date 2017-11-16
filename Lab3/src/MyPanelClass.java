import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Red stripes
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width, height/5);

                        g.setColor(Color.RED);
                        g.fillRect(x1, height/3+height/14, width, height/5);
                        
                        g.setColor(Color.RED);
                        g.fillRect(x1, height-(height/5), width, height/5);
                        
                        //Blue triangle
                        Polygon p = new Polygon();
                        p.addPoint(x1, y1);
                        p.addPoint(width/2, height/2);
                        p.addPoint(x1, height);
                        g.setColor(new Color(135,206,250));
                        g.fillPolygon(p);
                        
                        //White star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        p2.translate(width/10, height/3);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                      
                      /*//Draw a border
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        
                      //Draw a second border
                        g.setColor(Color.WHITE);
                        g.drawRect(x1 + 10, y1 + 10, width - 20, height - 20);
                        
                      //Draw a line
                        g.setColor(Color.RED);
                        g.drawLine(x1, y1, x2, y2);
                        
                      //Draw second line  
                        g.setColor(Color.BLUE);
                        g.drawLine(x1, y2, x2, y1);
                        
                      //Draw a circle 
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval((width-55)/2, (height-55)/2, 55, 55);*/
            }
}