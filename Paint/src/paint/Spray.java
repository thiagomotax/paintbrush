/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Thiago
 */
public class Spray extends D0 {

    public double raio = 10.0;

    public Spray(int x, int y) {
        super(x, y);
    }

    @Override
    public void desenhar(Graphics g) {
        Random rd = new Random();
        for (int i = 0; i < 30; i++) {
            if (y != 0) {
                int xNew = (int) ((int) x + rd.nextGaussian() * raio);
                int yNew = (int) ((int) y + rd.nextGaussian() * raio);
                g.setColor(cor);
                g.drawLine(xNew, yNew, xNew, yNew);
            }
        }
    }
}
