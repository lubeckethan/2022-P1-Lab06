// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet {

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);
        // 400, 300 is middle


        // Draw Random Lines
        Random rand = new Random();


        for (int k = 1; k <= 100; k++) {

            int x1 = rand.nextInt(375) + 10;
            int y1 = rand.nextInt(275) + 10;
            int x2 = rand.nextInt(375) + 10;
            int y2 = rand.nextInt(275) + 10;

            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            g.setColor(new Color(red,blue,green));
            g.drawLine(x1, y1, x2, y2);


        }


        // Draw Random Squares
        Random randS = new Random();
        for (int k = 1; k <= 100; k++) {

            int x1 = rand.nextInt(335) + 400;
            int y1 = rand.nextInt(225) + 10;
            int height = 40;
            int width = 40;

          int red = rand.nextInt(256);
          int green = rand.nextInt(256);
          int blue = rand.nextInt(256);

            g.setColor(new Color(red,blue,green));
            g.fillRect(x1, y1, height, width);


        }


        // Draw Random Circles
        Random randC = new Random();

        for (int k = 1; k <= 100; k++) {

            int cWidth = rand.nextInt(200);


            int cx1 = rand.nextInt(390 - cWidth) + 10;
            int cy1 = rand.nextInt(290 - cWidth) + 300;

            int red = rand.nextInt(256);
            int green = rand.nextInt(256);
            int blue = rand.nextInt(256);

            g.setColor(new Color(red,blue,green));



            g.drawOval(cx1, cy1, cWidth, cWidth);
        }
            // Draw 3-D Box
        g.setColor(Color.red);
        g.fillRect( 600,425,100,100);

        g.setColor(Color.green);
        Polygon Green = new Polygon();
        Green.addPoint(600,425);
        Green.addPoint(600,525);
        Green.addPoint(550,475);
        Green.addPoint(550,375);

        g.fillPolygon(Green);

        g.setColor(Color.yellow);
        Polygon Yellow = new Polygon();
        Yellow.addPoint(600,425);
        Yellow.addPoint(550,375);
        Yellow.addPoint(650,375);
        Yellow.addPoint(650,425);
    g.fillPolygon(Yellow);


        g.setColor(Color.blue);
        Polygon Blue = new Polygon();
        Blue.addPoint(650,375);
        Blue.addPoint(650,425);
        Blue.addPoint(700,425);
        g.fillPolygon(Blue);

    }
}


    
 