import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    int density = 10; //távolság a vonalak között
    drawLinesInQuarter(graphics, 0, density);
    drawLinesInQuarter(graphics, WIDTH, density);
  }

  public static void drawLinesInQuarter(Graphics graphics, int x1, int density) {
    int numberOfLines = WIDTH / 2 / density + 1;
    int yCenter = HEIGHT / 2;
    int xCenter = WIDTH / 2;
    int sign = (x1 == 0) ? 1 : -1;
    for (int i = 0; i < numberOfLines; i++) {
      graphics.drawLine(x1 + density * i * sign, yCenter, xCenter,
          yCenter + density * i);//bal felső negyed
      graphics.drawLine(x1 + density * i * sign, yCenter, xCenter, yCenter - density * i);//bal alsó
    }
  }


  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    EnvelopeStar.ImagePanel panel = new EnvelopeStar.ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.RED);
      mainDraw(graphics);
    }
  }
}