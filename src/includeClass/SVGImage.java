/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package includeClass;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Function;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author jayj2
 */
public class SVGImage extends JLabel {
    private FlatSVGIcon svgIcon;
    private Timer timer;
    private int iconColor = 0;
    private float alpha = 1f;

    public void setSvgImage(String image, int width, int height) {
        svgIcon = new FlatSVGIcon(image, width, height);
        setIcon(svgIcon);
    }
   
    public void animation(int time) {
        if(svgIcon != null) {
            svgIcon.setColorFilter(new FlatSVGIcon.ColorFilter(new Function<Color, Color>(){
                @Override
                public Color apply(Color t) {
                    iconColor += 1;
                    iconColor %= 255;
                    return Color.getHSBColor(iconColor / 255f, 1, 1);
                }
               
            }));
            timer = new Timer(time, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                   SVGImage.this.repaint();
                }              
            });
            timer.start();
        }
    }

    public void fadeAnimation(int time) {
        if (svgIcon != null) {
            timer = new Timer(time, new ActionListener() {
                float alpha = 1f;
                boolean decrease = true;

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (decrease) {
                        alpha -= 0.05f;
                        if (alpha <= 0.2f) decrease = false;
                    } else {
                        alpha += 0.05f;
                        if (alpha >= 1f) decrease = true;
                    }
                    setOpacity(alpha);
                    repaint();
                }
            });
            timer.start();
        }
    }
    
    public void setSvgImage(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setOpacity(float value) {
    this.alpha = value;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        super.paintComponent(g2);
        g2.dispose();
    }
}
