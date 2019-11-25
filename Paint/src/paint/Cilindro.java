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
public class Cilindro extends D3 {

    public int base, altura;

    public Cilindro(int x, int y) {
        super(x, y);
    }

    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);
        g.drawOval(x, y, base, altura);
        g.drawOval(x, y + altura+50, base, altura);
        g.drawLine(x, y + (altura / 2), x, (y +50+ (altura + (altura / 2))));
        g.drawLine(x+base, y + (altura / 2), x+base, (y +50+ (altura + (altura / 2))));
        System.out.println(altura);
        
   

//        g.drawRect(x, y, largura, altura);
//        //g.fillOval(x, y + (altura / 2), largura, altura);
//        g.setColor(cor);
//        g.drawOval(x, y + (altura / 2), largura, altura);
//        g.drawOval(x, y - (altura / 2), largura, altura);
//
//        //g.fillRect(x, y, largura, altura);
//        g.setColor(Color.yellow);
    }

}
