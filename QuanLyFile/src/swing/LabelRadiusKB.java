/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author caoho
 */
public class LabelRadiusKB extends JLabel{
    private int round;
    private int width = 100;
    private int height = 50;
    private Icon icon;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public LabelRadiusKB() {
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        JLabel label = new JLabel("Nam mô Phật");
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setBackground(Color.yellow);
        g2d.setColor(Color.blue);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillRoundRect(0, 0, width, height, round, round);
        g2d.dispose();
    }
    
}
