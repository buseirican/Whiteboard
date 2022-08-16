import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TimerFrame extends JFrame {
    JLabel messageLabel, timerLabel;
    JTextField tf;
    JButton button;
    Timer timer;

    public TimerFrame() {

        setLayout(new GridLayout(2, 2, 5, 5));


        messageLabel = new JLabel("Enter Seconds ", SwingConstants.CENTER);
        add(messageLabel);


        tf = new JTextField(5);
        add(tf);

        button = new JButton("START");
        add(button);

        timerLabel = new JLabel("...", SwingConstants.CENTER);
        add(timerLabel);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int count = (int) (Double.parseDouble(tf.getText()));
            timerLabel.setText((count+" seconds left"));

            TimeClass tc = new TimeClass(count);
            timer = new Timer(1000, tc);
            timer.start();
        }
    }

    public class TimeClass implements ActionListener {
        int counter;
        public TimeClass(int counter) {
            this.counter=counter;
        }
        public void actionPerformed(ActionEvent tc){
            counter--;

            if(counter >= 1){
                timerLabel.setText(counter+" seconds left");
            }
            else {
                timer.stop();
                timerLabel.setText("Time is over");
                Toolkit.getDefaultToolkit().beep();
                JFrame jf = new JFrame("Animation");
                jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                jf.setSize(700,200);
                jf.add(new Animation());
                jf.setVisible(true);
            }
        }
    }

}
