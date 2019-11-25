/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 *
 * @author Thiago
 */
public class Poligono extends D1 {

    ArrayList<D0> pontos = new ArrayList<>();

    public Poligono(int x, int y) {
        super(x, y);
    }

    @Override
    public void desenhar(Graphics g) {
        g.setColor(Color.red);

        pontos.add(new D0(x, y));
        g.drawLine(x, y, x, y);

    }

    public void formarPoligono(Graphics g) {
        int xPoints[] = new int[pontos.size()];
        int yPoints[] = new int[pontos.size()];

        for (int i = 0; i < pontos.size(); i++) {
            xPoints[i] = pontos.get(i).x;
            System.out.println(pontos.get(i).x);
            yPoints[i] = pontos.get(i).y;
        }

        for (int i = 1; i < pontos.size(); i++) {
            g.setColor(cor);
            g.drawPolygon(xPoints, yPoints, pontos.size());

        }
    }

    public void limparListaPontos() {
        pontos.removeAll(pontos);
        pontos.clear();

    }

}
