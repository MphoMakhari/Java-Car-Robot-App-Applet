/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;

/**
 *
 * @author Makhari Mpho
 */
public class Robotx extends Applet {

    private Ellipse2D.Double cir1;
    private Ellipse2D.Double cir2;
    private Ellipse2D.Double cir3;
    private Rectangle2D.Double reclight;
    private Graphics2D myg2d;

    public Robotx() {
        this.addMouseListener(new RobotEvHandler());
    }

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        setSize(1700, 700);
        setForeground(Color.red);
        Font myFont = new Font("Arial", Font.BOLD, 18);
        setFont(myFont);

    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();

        myg2d = g2d;

        int y = 10;

        myg2d.setColor(Color.gray);
        Rectangle2D.Double road = new Rectangle2D.Double(10, 400, 1690, 290);
        myg2d.fill(road);

        myg2d.setColor(Color.white);
        Rectangle2D.Double carfill = new Rectangle2D.Double(200, 380, 715, 130);
        myg2d.fill(carfill);

        myg2d.setColor(Color.BLACK);

        Rectangle2D.Double rec = new Rectangle2D.Double(10, 10, 110, 200);

        cir1 = new Ellipse2D.Double(39, 20, 50, 50);
        cir2 = new Ellipse2D.Double(39, 80, 50, 50);
        cir3 = new Ellipse2D.Double(39, 140, 50, 50);

        Point2D.Double pd = new Point2D.Double(63, 222);
        Point2D.Double pd1 = new Point2D.Double(63, 400 + y);

        Line2D.Double line = new Line2D.Double(pd, pd1);

        Ellipse2D.Double cir4 = new Ellipse2D.Double(16, 390 + y, 100, 50);

        myg2d.setColor(Color.BLACK);
        myg2d.fill(rec);

        myg2d.setStroke(new BasicStroke(25));
        myg2d.setColor(Color.BLACK);
        myg2d.draw(line);

        myg2d.setColor(Color.BLACK);
        myg2d.fill(cir4);

        myg2d.setColor(Color.GRAY);

        myg2d.fill(cir1);

        myg2d.fill(cir2);

        myg2d.fill(cir3);

        myg2d.setColor(Color.BLACK);
        //car
        Point2D.Double PA = new Point2D.Double(200, 500 + y);
        Point2D.Double PB = new Point2D.Double(200, 300 + y);
        Point2D.Double PC = new Point2D.Double(400, 300 + y);
        Point2D.Double PD = new Point2D.Double(550, 200 + y);
        Point2D.Double PE = new Point2D.Double(750 + 60, 200 + y);
        Point2D.Double PF = new Point2D.Double(850 + 60, 300 + y);
        Point2D.Double PG = new Point2D.Double(850 + 60, 500 + y);
        //Point2D.Double PH = new Point2D.Double(280 + 60, 220);

        Line2D.Double line1 = new Line2D.Double(PA, PB);
        Line2D.Double line2 = new Line2D.Double(PB, PC);
        Line2D.Double line3 = new Line2D.Double(PC, PD);
        Line2D.Double line4 = new Line2D.Double(PD, PE);
        Line2D.Double line5 = new Line2D.Double(PE, PF);
        Line2D.Double line6 = new Line2D.Double(PF, PG);
        Line2D.Double line7 = new Line2D.Double(PG, PA);
//        Line2D.Double line8 = new Line2D.Double(PB, PC);

        Point2D.Double WPA = new Point2D.Double(400, 300 + 10 + y);
        Point2D.Double WPB = new Point2D.Double(550, 200 + 10 + y);
        Point2D.Double WPC = new Point2D.Double(650, 200 + 10 + y);
        Point2D.Double WPD = new Point2D.Double(650, 300 + 10 + y);

        Point2D.Double WPA2 = new Point2D.Double(490, 270 + 10 + y);

        Point2D.Double WPA1 = new Point2D.Double(804, 300 + 10 + y);
        Point2D.Double WPB1 = new Point2D.Double(804, 200 + 10 + y);
        Point2D.Double WPC1 = new Point2D.Double(910 - 10, 300 + 10 + y);

        Line2D.Double winline1 = new Line2D.Double(WPA, WPB);
        Line2D.Double winline2 = new Line2D.Double(WPB, WPC);
        Line2D.Double winline3 = new Line2D.Double(WPC, WPD);
        Line2D.Double winline4 = new Line2D.Double(WPD, WPA);
//         
        Line2D.Double winlinea = new Line2D.Double(WPA, WPA2);
// 
        Line2D.Double winline5 = new Line2D.Double(WPA1, WPB1);
        Line2D.Double winline6 = new Line2D.Double(WPB1, WPC1);
        Line2D.Double winline7 = new Line2D.Double(WPC1, WPA1);

        Ellipse2D.Double wheel = new Ellipse2D.Double(470, 260 + y, 50, 40);

        Rectangle2D.Double seat1 = new Rectangle2D.Double(764 - 10, 210 + 10 + y, 30, 100 - 10);
        Rectangle2D.Double seat2 = new Rectangle2D.Double(594, 210 + 10 + y, 30, 100 - 10);

        myg2d.setStroke(new BasicStroke(10));
        myg2d.setColor(Color.black);

        myg2d.fill(wheel);

        myg2d.draw(line1);
        myg2d.draw(line2);
        myg2d.draw(line3);
        myg2d.draw(line4);
        myg2d.draw(line5);
        myg2d.draw(line6);
        myg2d.draw(line7);

        myg2d.setStroke(new BasicStroke(5));

        myg2d.draw(winline1);
        myg2d.draw(winline2);
        myg2d.draw(winline3);
        myg2d.draw(winline4);

        myg2d.draw(winlinea);

        myg2d.draw(winline5);
        myg2d.draw(winline6);
        myg2d.draw(winline7);

        Rectangle2D.Double winrect = new Rectangle2D.Double(674 - 10, 210 + y, 130, 100);

        myg2d.draw(winrect);

        Ellipse2D.Double tire1 = new Ellipse2D.Double(250, 400 + y, 160, 160);
        Ellipse2D.Double tire2 = new Ellipse2D.Double(700, 400 + y, 160, 160);

        myg2d.fill(tire1);
        myg2d.fill(tire2);

        Ellipse2D.Double rim1 = new Ellipse2D.Double(265, 425, 130, 130);
        Ellipse2D.Double rim2 = new Ellipse2D.Double(715, 425, 130, 130);

        myg2d.setColor(Color.white);

        myg2d.fill(rim1);
        myg2d.fill(rim2);

        myg2d.setColor(Color.black);

        Point2D.Double l1p = new Point.Double(10, 570);
        Point2D.Double l1p1 = new Point.Double(1700, 570);

        Line2D.Double rd1 = new Line2D.Double(l1p, l1p1);

        myg2d.setColor(Color.white);
        myg2d.draw(rd1);

        Point2D.Double l1p2 = new Point.Double(10, 670);
        Point2D.Double l1p3 = new Point.Double(1700, 670);

        Line2D.Double rd2 = new Line2D.Double(l1p2, l1p3);
        myg2d.setColor(Color.yellow);
        myg2d.draw(rd2);

        Point2D.Double l1p4 = new Point.Double(10, 450);
        Point2D.Double l1p5 = new Point.Double(192, 450);

        Line2D.Double rd3 = new Line2D.Double(l1p4, l1p5);
        myg2d.setColor(Color.black);
        reclight = new Rectangle2D.Double(855, 360, 50, 30);
        myg2d.draw(reclight);
        myg2d.setColor(Color.yellow);
        myg2d.draw(rd3);

        Point2D.Double l1p6 = new Point.Double(917, 450);
        Point2D.Double l1p7 = new Point.Double(1700, 450);

        Line2D.Double rd4 = new Line2D.Double(l1p6, l1p7);

        myg2d.draw(rd4);

        myg2d.setColor(Color.black);
        myg2d.draw(seat1);
        myg2d.draw(seat2);

    }

    private class RobotEvHandler implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {

            if (me.getButton() == me.BUTTON1) {
                reclight = new Rectangle2D.Double(855, 360, 50, 30);
                if (me.getClickCount() == 1) {
                    cir1 = new Ellipse2D.Double(39, 20, 50, 50);
                    cir2 = new Ellipse2D.Double(39, 80, 50, 50);
                    cir3 = new Ellipse2D.Double(39, 140, 50, 50);

                    myg2d.setColor(Color.red);
                    myg2d.fill(cir1);
                    myg2d.draw(reclight);
                    myg2d.fill(reclight);

                    myg2d.setColor(Color.gray);
                    myg2d.fill(cir2);
                    myg2d.fill(cir3);

                } else if (me.getClickCount() == 2) {
                    cir1 = new Ellipse2D.Double(39, 20, 50, 50);
                    cir2 = new Ellipse2D.Double(39, 80, 50, 50);
                    cir3 = new Ellipse2D.Double(39, 140, 50, 50);

                    myg2d.setColor(Color.orange);
                    myg2d.fill(cir2);

                    myg2d.setColor(Color.gray);
                    myg2d.fill(cir1);
                    myg2d.fill(cir3);

                    myg2d.setColor(Color.white);
                    myg2d.fill(reclight);
                    myg2d.setColor(Color.black);
                    myg2d.draw(reclight);;

                } else if (me.getClickCount() == 3) {
                    cir1 = new Ellipse2D.Double(39, 20, 50, 50);
                    cir2 = new Ellipse2D.Double(39, 80, 50, 50);
                    cir3 = new Ellipse2D.Double(39, 140, 50, 50);

                    myg2d.setColor(Color.green);
                    myg2d.fill(cir3);

                    myg2d.setColor(Color.gray);
                    myg2d.fill(cir1);
                    myg2d.fill(cir2);

                    myg2d.setColor(Color.white);
                    myg2d.fill(reclight);
                    myg2d.setColor(Color.black);
                    myg2d.draw(reclight);

                }

            }

        }

        @Override
        public void mousePressed(MouseEvent me) {
            //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent me) {
            //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    // TODO overwrite start(), stop() and destroy() methods
}
