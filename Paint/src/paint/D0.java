/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Thiago
 */
public class D0 {
   public int x, y;
   public Color cor;

    D0(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
   
   public void desenhar(Graphics g){
       g.setColor(cor);
       g.drawLine(x, y, x, y);
   }
}
