import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JFrame {
    private JTextField text1;
    private JButton loginBT;
    private JLabel userlabel;
    private JPanel panel1;
    private JLabel label2;
    private JLabel background;


    public Login() {

        panel1 = new JPanel();
        setContentPane(panel1);
        panel1.setLayout(null);


        ImageIcon img=new ImageIcon("src\\bauicon.png");
        background=new JLabel("",img,JLabel.CENTER);
        background.setBounds(0,0,400,400);


        userlabel = new JLabel("USERNAME  :");
        userlabel.setBounds(20, 200, 77, 16);
        panel1.add(userlabel);

        text1 = new JTextField(10);
        text1.setBounds(110, 195, 120, 28);
        panel1.add(text1);

        loginBT = new JButton("Login");
        loginBT.setBounds(250, 194, 120, 28);
        loginBT.setBackground(Color.white);
        panel1.add(loginBT);

        label2 = new JLabel("BAU EDUCATIONAL APPLICATION");
        Font f=new Font("Arial",Font.BOLD,16);
        label2.setFont(f);
        label2.setBounds(66,18,300,40);
        panel1.add(label2);

        panel1.add(background);


        HandlerClass handler = new HandlerClass();
        loginBT.addActionListener(handler);

    }


    private class HandlerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String inputString = text1.getText();

            if (inputString.equals("Erkut") || inputString.equals("Tarkan")) {
                setVisible(false);
                WBoard k = new WBoard();
                k.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "You have no permission to enter!");
            }
        }
    }
}