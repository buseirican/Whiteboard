import javax.swing.*;
import java.awt.*;

public class StudentMain extends Login
{
    public static void main (String[] args)
    {
        StudentLogin jf = new StudentLogin();
        jf.setTitle("Login For Student");
        jf.setSize(400,400);
        jf.setResizable(false);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}