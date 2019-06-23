/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyukrisk;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author TOSHIBA S70
 */
public class ResimPaneli extends JPanel {
    
    int x = 0,y = 0,x2  = getWidth(), x3 = getWidth(),y2 = 184;
    Image imj = new ImageIcon("C:\\resimler\\arkaplan.png").getImage();
    int sayac = 0;
    private String yazi = "---BÜYÜK RİSK'E HOŞGELDİNİZ------BÜYÜK RİSK'E HOŞGELDİNİZ------BÜYÜK RİSK'E HOŞGELDİNİZ------BÜYÜK RİSK'E HOŞGELDİNİZ------BÜYÜK RİSK'E HOŞGELDİNİZ------BÜYÜK RİSK'E HOŞGELDİNİZ------BÜYÜK RİSK'E HOŞGELDİNİZ------BÜYÜK RİSK'E HOŞGELDİNİZ------";
    
 
    
    
    public ResimPaneli()
    {
     /*   this. x = x;
        this.y = y;
        this.imj = imj;*/
        
        Timer zamanlayici = new Timer(15, new ActionListener(){
            
               @Override
                public void actionPerformed(ActionEvent e)
                {
                  sayac = sayac + 1;
                  repaint();
                }
                
                
        
        });
        
        zamanlayici.start();
        
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        g.drawImage(imj, x, y, null);
        
        Graphics2D gg = (Graphics2D)g;
        gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        gg.setStroke(new BasicStroke(50,BasicStroke.CAP_SQUARE,BasicStroke.JOIN_MITER));
        gg.setColor(Color.red);
        gg.drawLine(0,180,1920,180);
        
        g.drawImage(new ImageIcon("C:\\resimler\\buyukrisklogo.png").getImage(),getWidth()/2 - 60, 10 , null);
        
        if (sayac >=50 && sayac <= 100)
        {
                g.setColor(Color.green);
               if ( sayac == 100)
                    sayac = 0;
        }
        else
            g.setColor(Color.white);
         
         if ( x2 <= -2400)
             x2 = getWidth();
         
         x2 = x2 - 1;
        g.setFont(new Font("SansSerif",Font.BOLD,20));
        
        g.drawString(yazi, x2 , y2);
        
        
    }
    
    
    
}
