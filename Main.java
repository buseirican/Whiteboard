import javax.swing.*;


public class Main extends Login
{
    public static void main (String[] args)
    {
        Login jf = new Login();
        jf.setTitle("Login For Teacher");
        jf.setSize(400,400);
        jf.setResizable(false);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}