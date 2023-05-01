/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.applet.Applet;
import java.awt.*;
import java.awt.geom.*;

/**
 *
 * @author Makhari Mpho
 */
public class OlymicLogo extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Ellipse2D.Double cir1 = new Ellipse2D.Double(40, 40, 90, 90);
        Ellipse2D.Double cir2 = new Ellipse2D.Double(110, 70, 90, 90);
        Ellipse2D.Double cir3 = new Ellipse2D.Double(170, 40, 90, 90);
        Ellipse2D.Double cir4 = new Ellipse2D.Double(230, 70, 90, 90);
        Ellipse2D.Double cir5 = new Ellipse2D.Double(290, 40, 90, 90);

        g2d.setStroke(new BasicStroke(10));

        g2d.setColor(Color.BLUE);
        g2d.draw(cir1);

        g2d.setColor(Color.ORANGE);
        g2d.draw(cir2);

        g2d.setColor(Color.BLACK);
        g2d.draw(cir3);

        g2d.setColor(Color.green);
        g2d.draw(cir4);

        g2d.setColor(Color.RED);
        g2d.draw(cir5);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
