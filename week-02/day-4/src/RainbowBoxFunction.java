
import java.util.HashMap;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
    String[] rainbow = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
    drawColoredSquareToCenter(40, "red", graphics);
    int edge = 420;
    for ( String colorname : rainbow ) {
      drawColoredSquareToCenter(edge, colorname, graphics);
      edge -=60;
    }


  }

  public static void drawColoredSquareToCenter(int edge, String colorname, Graphics graphics){
    int centerX=WIDTH/2;
    int centerY = HEIGHT/2;
    graphics.setColor(Color.decode(colorNameToHex(colorname)));
    graphics.fillRect(centerX-edge/2, centerY-edge/2, edge, edge);
  }

  public static String colorNameToHex(String colorname){
    HashMap<String, String> colorcode = new HashMap<>();
    colorcode.put("red", "#FF0000");
    colorcode.put("orange", "#FFA500");
    colorcode.put("yellow", "#FFFF00");
    colorcode.put("green","#008000");
    colorcode.put("blue", "#0000FF");
    colorcode.put("indigo", "#4B0082");
    colorcode.put("violet", "#EE82EE");
    return colorcode.get(colorname);
  }

  // Don't touch the code below
  static int WIDTH = 420;
  static int HEIGHT = 420;

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