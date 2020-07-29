package circle;

import java.awt.geom.Ellipse2D;
import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circle {
  public static void mainDraw(Graphics2D g) {
    drawCircle(50, 50, 50, g);


  }

  static void drawCircle(int x, int y, float radius, Graphics2D g) {
    g.draw(new Ellipse2D.Double(x, y, radius, radius));
    if (radius > 2) {
      radius *= 0.75f;
      drawCircle(x, y, radius, g);
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);

      Graphics2D g = (Graphics2D) graphics;
      mainDraw(g);
    }
  }
}