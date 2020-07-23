import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern.
    for (int i = 0; i < 320; i += 40) {
      for (int j = 0; j < 320; j += 40) {
        fillBlackSquare(graphics, i, j);
        fillBlackSquare(graphics, j, i);
      }
    }


  }

  public static void fillBlackSquare(Graphics graphics, int x, int y) {
    int size = 20;
    graphics.setColor(Color.BLACK);
    graphics.fillRect(x, y, size, size);
  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

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
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}