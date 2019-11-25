/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Graphics;

/**
 *
 * @author Thiago
 */
public class D1 extends D0 {

    public int x1, y1;

    public D1(int x, int y) {
        super(x, y);
    }

 
    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);
        g.setColor(cor);
        g.drawLine(x, y, x1, y1);
    }
}
