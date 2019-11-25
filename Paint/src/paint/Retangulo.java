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
public class Retangulo extends D2 {

    public int largura, base;

    public Retangulo(int x, int y) {
        super(x, y);
    }

    @Override
    public double area() {
        return base * largura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + largura);
    }

    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);
        g.setColor(corInterna);
        g.fillRect(x, y, base, largura);
        g.setColor(cor);
        g.drawRect(x, y, base, largura);
    }

}
