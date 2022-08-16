import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class StudentWBoard extends JFrame {


    private JMenuBar jmb;
    private JButton hand;
    private JPanel panel;
    private JLabel label;
    JPanel jpanel;
    private JButton chat;


    public StudentWBoard() {
        super("Whiteboard For Student");
        setLayout(new FlowLayout());
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        jmb = new JMenuBar();
        setJMenuBar(jmb);
        jmb.setBackground(Color.white);

        jpanel = new DrawPanel();
        jpanel.setBackground(Color.white);
        jpanel.setPreferredSize(new Dimension(2000, 2000));
        add(jpanel, BorderLayout.CENTER);



        hand = new JButton("RAISE HAND");
        hand.setBackground(Color.cyan);
        hand.setPreferredSize(new Dimension(170, 50));
        hand.setIcon(new ImageIcon("src\\handicon.png"));
        jmb.add(hand);


        HandlerClass handler = new HandlerClass();
        hand.addActionListener(handler);



        chat = new JButton("CHATBOX");
        chat.setBackground(Color.cyan);
        chat.setIcon(new ImageIcon("src\\chat.png"));
        jmb.add(chat);
        chatClass Box = new chatClass();
        chat.addActionListener(Box);

    }



    private class HandlerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane panel = new JOptionPane();
            panel.showMessageDialog(null, "I have a question");
        }
    }


    private class chatClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Chatbox c = new Chatbox();
            c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            c.setVisible(true);
            c.setSize(400, 400);
        }
    }
}


