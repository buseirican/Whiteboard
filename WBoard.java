import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class WBoard extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    protected static Color color;
    static int clickCount;
    public static ArrayList<Shapes> objects = new ArrayList<Shapes>();

    private JMenuBar jmb;
    private JMenu shape;
    private JMenuItem circle;
    private JMenuItem square;
    private JMenuItem line;
    private JButton hand;
    private JButton countdown;
    private JPanel panel;
    private JLabel label;
    private JButton colorr;
    private JPanel panel2;
    private JButton attendance;
    JPanel jpanel;
    public static String check;
    private JButton chat;


    public WBoard() {
        super("Whiteboard For Teacher");
        setLayout(new FlowLayout());
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        jpanel = new DrawPanel();
        jpanel.addMouseListener(this);
        jpanel.addMouseMotionListener(this);
        jpanel.setBackground(Color.white);
        jpanel.setPreferredSize(new Dimension(2000, 2000));
        add(jpanel, BorderLayout.CENTER);


        jmb = new JMenuBar();
        setJMenuBar(jmb);
        jmb.setBackground(Color.white);

        shape = new JMenu("SHAPES");
        shape.setBackground(Color.cyan);
        shape.setIcon(new ImageIcon("src\\shapeicon.png"));
        jmb.add(shape);
        shape.addSeparator();

        circle = new JMenuItem("DRAW CIRCLES");
        circle.setBackground(Color.cyan);
        circle.setPreferredSize(new Dimension(110, 20));
        shape.add(circle);
        circle.addActionListener(this);
        shape.addSeparator();

        square = new JMenuItem("DRAW SQUARES");
        square.setBackground(Color.cyan);
        square.setPreferredSize(new Dimension(110, 20));
        shape.add(square);
        square.addActionListener(this);
        shape.addSeparator();

        line = new JMenuItem("DRAW LINE");
        line.setBackground(Color.cyan);
        line.setPreferredSize(new Dimension(110, 20));
        shape.add(line);
        line.addActionListener(this);
        line.addMouseListener(this);



        hand = new JButton("RAISE HAND");
        hand.setBackground(Color.cyan);
        hand.setPreferredSize(new Dimension(170, 50));
        hand.setIcon(new ImageIcon("src\\handicon.png"));
        jmb.add(hand);

        countdown = new JButton("SET TIME");
        countdown.setBackground(Color.cyan);
        countdown.setIcon(new ImageIcon("src\\time.png"));
        countdown.setPreferredSize(new Dimension(170, 50));
        jmb.add(countdown);

        Zaman b = new Zaman();
        countdown.addActionListener(b);


        HandlerClass handler = new HandlerClass();
        hand.addActionListener(handler);


        colorr = new JButton("CHANGE COLOR");
        colorr.setIcon(new ImageIcon("src\\color.png"));
        colorr.setPreferredSize(new Dimension(170, 50));
        colorr.setBackground(Color.cyan);
        jmb.add(colorr);
        Pickerclass picker = new Pickerclass();
        colorr.addActionListener(picker);

        chat = new JButton("CHATBOX");
        chat.setBackground(Color.cyan);
        chat.setIcon(new ImageIcon("src\\chat.png"));
        jmb.add(chat);
        chatClass Box = new chatClass();
        chat.addActionListener(Box);

        attendance = new JButton("ATTENDANCE");
        attendance.setBackground(Color.cyan);
        attendance.setPreferredSize(new Dimension(170, 50));
        attendance.setIcon(new ImageIcon("src\\attendance.png"));
        attendance.addActionListener(this);
        jmb.add(attendance);


        JLabel label = new JLabel(String.format("You clicked %d times", clickCount));
        label.setBackground(Color.cyan);
        label.setIcon(new ImageIcon("src\\click.png"));
        jmb.add(label);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (check == "square") {
            Shapes s = new Shapes();
            s.x = e.getX();
            s.y = e.getY();
            objects.add(s);
            repaint();
            clickCount++;
            //label.setText(String.format("you clicked %d times",clickCount));
        } else if (check == "circle") {
            Shapes c = new Shapes();
            c.diameter1 = e.getX();
            c.diameter2 = e.getY();
            objects.add(c);
            repaint();
            clickCount++;
            //label.setText(String.format("you clicked %d times",clickCount));
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (check == "line") {

            Shapes b = new Shapes();
            b.x1 = e.getX();
            b.y1 = e.getY();
            objects.add(b);
            //repaint();

        }
        //clickCount++;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (check == "line") {

            Shapes z = new Shapes();
            z.x2 = e.getX();
            z.y2 = e.getY();
            objects.add(z);
            repaint();
            clickCount++;
            //label.setText(String.format("you clicked %d times",clickCount));
        }
        //clickCount++;
        //label.setText(String.format("you clicked %d times",clickCount));
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == square) {
            check = "square";
        } else if (e.getSource() == circle) {
            check = "circle";
        } else if (e.getSource() == line) {
            check = "line";
        }

        //clickCount++;
        //label.setText(String.format("you clicked %d times",clickCount));

    }

    @Override
    public void mouseDragged(MouseEvent e) {


    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


    private class HandlerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane panel = new JOptionPane();
            panel.showMessageDialog(null, "Student raised hand");
        }
    }

    private class Zaman implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            TimerFrame timerTutorial = new TimerFrame();
            timerTutorial.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            timerTutorial.setSize(200, 200);
            timerTutorial.setResizable(false);
            timerTutorial.setTitle("Timer");
            timerTutorial.setVisible(true);

        }
    }

    private class Pickerclass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            color = JColorChooser.showDialog(null, "Choose Color", Color.red);

            repaint();
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


