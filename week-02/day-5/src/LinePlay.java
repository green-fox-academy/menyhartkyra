import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay{
  public static void mainDraw(Graphics graphics){
    int divide = 16;
    caustica(graphics, divide);

  }

  public static void caustica (Graphics graphics, int divide ){
    int numberOfRepeats = (int) Math.sqrt(divide); //egy oldalon hányszor ismétlődik
    int x = WIDTH/numberOfRepeats;
    int y = HEIGHT/numberOfRepeats;


    for (int j = 0; j < divide; j++) {
      graphics.setColor(Color.MAGENTA);
      for (int i=40/numberOfRepeats; i < 320/numberOfRepeats; i+=20/numberOfRepeats) {
        for (int k = 0; k < numberOfRepeats; k++) {
          graphics.drawLine(i+(x*j), (y*j), 320/numberOfRepeats+(x*j), i+(y*j));//átlók
          graphics.drawLine(i+(x*j), k*y, 320/numberOfRepeats+(x*j), i+k*y); //jobb felül
          graphics.drawLine(i+(k*x), (y*j), 320/numberOfRepeats+(k*x), i+(y*j)); //bal alul
        }

      }
      graphics.setColor(Color.GREEN);
      for (int i = 40/numberOfRepeats; i < 320/numberOfRepeats; i+=20/numberOfRepeats) {
        for (int k = 0; k < numberOfRepeats; k++) {
          graphics.drawLine((x*j), i+(y*j), i-(20/numberOfRepeats)+(x*j), 320/numberOfRepeats+(y*j));//átlók
          graphics.drawLine((x*j), i+(y*k), i-(20/numberOfRepeats)+(x*j), 320/numberOfRepeats+(y*k));   //jobb felül
          graphics.drawLine((k*x), i+(y*j), i-(20/numberOfRepeats)+(k*x), 320/numberOfRepeats+(y*j)); //bal alul
        }

      }
    }

    /*for (int j = 0; j < numberOfrepeats; j++) {
      graphics.setColor(Color.MAGENTA);
      for (int i=40/numberOfrepeats; i < 320/numberOfrepeats; i+=20/numberOfrepeats) {
        graphics.drawLine(i+(x*j), 0, 320/numberOfrepeats+(x*j), i); //jobb felül
        graphics.drawLine(i, (y*j), 320/numberOfrepeats, i+(y*j)); //bal alul
      }
      graphics.setColor(Color.GREEN);
      for (int i = 40/numberOfrepeats; i < 320/numberOfrepeats; i+=20/numberOfrepeats) {
        graphics.drawLine((x*j), i, i-(20/numberOfrepeats)+(x*j), 320/numberOfrepeats);   //jobb felül
        graphics.drawLine(0, i+(y*j), i-(20/numberOfrepeats), 320/numberOfrepeats+(y*j)); //bal alul
      }
    }*/

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
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}