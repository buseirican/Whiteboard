import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Chatbox extends JFrame {

    BorderLayout bl;
    GridLayout gl;
    JTextArea jta;
    JTextField jtf;
    JButton send;
    JPanel jp;

    public Chatbox() {
        super(" Chat Box");
        initGui();
    }

    public void initGui() {

        bl = new BorderLayout();
        setLayout(bl);

        jta = new JTextArea();
        jta.setEditable(false);
        add(new JScrollPane(jta), BorderLayout.CENTER);

        gl = new GridLayout(2, 1);
        jp = new JPanel();
        jp.setLayout(gl);
        add(jp, BorderLayout.SOUTH);

        jtf = new JTextField();
        jp.add(jtf);

        send = new JButton("Send");
        send.setEnabled(false);
        jp.add(send);
        send.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                jtf.setText(" ");
            }
        });
    }
}












