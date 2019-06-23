/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyukrisk;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author TOSHIBA S70
 */
public class ResimPaneli2 extends JPanel {

    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        g.drawImage(new ImageIcon("C:\\resimler\\arkaplan.png").getImage(), 0 ,0, null);
    }
    
    
}
