import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Animation extends JPanel {
    int x = 0;
    int y = 100;

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("Comic Sans", Font.BOLD+Font.ITALIC,50);
        g2.setFont(font);
        g2.setColor(Color.RED);
        g2.drawString("TIME IS UP!",x,y);

        try {
            Thread.sleep(450);
        }

        catch(Exception ex) {

        }

        x+=10;
        if(x>this.getWidth()) {
            x=0;
        }

        repaint();
    }
}
