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
 * @author Vitor
 */
public class Borracha extends Retangulo {

    public Borracha(int x, int y) {
        super(x, y);
    }
    
    
    
      public void desenhar(Graphics g) {
        super.desenhar(g);
        g.setColor(Color.WHITE);
        g.fillRect(x, y, base, largura);
        g.setColor(Color.WHITE);
        g.drawRect(x, y, base, largura);
    }
}
