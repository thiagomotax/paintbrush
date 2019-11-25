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
abstract public class D2 extends D0{
    public boolean showArea = false;
    public boolean showPerimetro = false;
    public Color corInterna;

    public D2(int x, int y) {
        super(x, y);
    }
    
    abstract public double area();
    abstract public double perimetro();
    
    @Override
    public void desenhar(Graphics g){
        if(showArea){
            g.drawString((Double.toString((int)area())), x, y-20);
        }
        if(showPerimetro){
            g.drawString((Double.toString((int)perimetro())), x, y-50);
        }
    }
    
    
}
