import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
  public static void mainDraw(Graphics graphics) {
    // Reproduce this:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r4.png]
    int x = 10;
    int y = 10;
    for (int i = 1; i < 6; i++) {
      fillPurpleSquare(graphics, i * 10, x, y);
      x += i * 10;
      y += i * 10;
    }
  }

  public static void fillPurpleSquare(Graphics graphics, int size, int x, int y) {
    graphics.setColor(Color.decode("#9400D3"));
    graphics.fillRect(x, y, size, size);
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x - 1, y - 1, size, size);
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
    jFrame.setBackground(Color.WHITE);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}