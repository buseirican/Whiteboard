import java.awt.*;
import javax.swing.*;

public class DrawPanel extends JPanel {


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(WBoard.color);

        for (int i = 0; i < WBoard.objects.size(); i++) {
            g.drawRect(WBoard.objects.get(i).x-15, WBoard.objects.get(i).y-15, 30, 30);
        }
        for (int i = 0; i < WBoard.objects.size(); i++) {
            g.fillOval(WBoard.objects.get(i).diameter1 - 15, WBoard.objects.get(i).diameter2 - 15, 30, 30);
        }
        for (int i = 0; i < WBoard.objects.size(); i++) {
            g.drawLine(WBoard.objects.get(i).x1, WBoard.objects.get(i).y1, WBoard.objects.get(i).x2, WBoard.objects.get(i).y2);
        }
    }
}
