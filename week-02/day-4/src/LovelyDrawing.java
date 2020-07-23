import java.math.MathContext;
import java.util.Random;
import javax.swing.*;
import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LovelyDrawing {
  public static void mainDraw(Graphics graphics) {
    // draw a red horizontal line to the canvas' middle.
    graphics.setColor(Color.RED);
    graphics.drawLine(0, 300, 600, 300);

    // Draw a triangle with size 100 to the bottom center of the screen
    int triangles = 20;
    int edge = 600;
    int sizeChange = edge / triangles;

    for (int i = 0; i < triangles; i++) {
      edge -= sizeChange;
      drawRegularTriangleWithRandomColors(graphics, edge);
    }
  }

  public static void drawRegularTriangleWithRandomColors(Graphics graphics, int edge) {
    int triangleHeight = calculateHeightFromEdge(edge);
    int halfWidth = WIDTH / 2;
    int halfEdge = edge / 2;
    int[] xCoordinates = {halfWidth - halfEdge, halfWidth, halfWidth + halfEdge};
    int[] yCoordinates = {HEIGHT, HEIGHT - triangleHeight, HEIGHT};
    graphics.setColor(getRandomColor());
    graphics.fillPolygon(xCoordinates, yCoordinates, xCoordinates.length);
  }

  public static int calculateHeightFromEdge(int edge) {
    return (int) ((Math.sqrt(3) / 2) * edge);
  }

  public static Color getRandomColor() {
    Random random = new Random();
    int limit = 256;
    return new Color(random.nextInt(limit), random.nextInt(limit), random.nextInt(limit));
  }

  //region predefined code
  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Lovely Drawing");
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
  //endregion
}