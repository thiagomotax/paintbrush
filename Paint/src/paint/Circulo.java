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
public class Circulo extends D2 {
    public int raio, base, altura;

    public Circulo(int x, int y) {
        super(x, y);
    }
    @Override
    public double area() {
        double doubleBase = new Double(base);
        double doubleAltura = new Double(altura);
        raio = (int) (Math.sqrt(doubleBase) + Math.sqrt(doubleAltura));
        return (Math.PI * raio * raio);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
        double doubleBase = new Double(base);
        double doubleAltura = new Double(altura);
        raio = (int) (Math.sqrt(doubleBase) + Math.sqrt(doubleAltura));
        return (2*Math.PI * raio);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void desenhar(Graphics g) {
        super.desenhar(g);
        g.setColor(corInterna);
        g.fillOval(x, y, base, altura);
        g.setColor(cor);
        g.drawOval(x, y, base-1, altura-1);
        //g.drawString("Area: " + (int) area(), x, y-20);
    }
}
