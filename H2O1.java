import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H2O1 extends JFrame implements ActionListener {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { GUI();

            }
        });
    }

    private static void GUI(){
        JFrame frame = new JFrame("H2O"); // create a new jframe
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing
        frame.setSize(1000,1000);// set size of the frame

        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("X"); // create label X
        JLabel label2 = new JLabel("Y"); // create label Y
        window.add(label1); // add label X to window
        window.add(label2); // add label Y to window

        JButton button = new JButton("Submit"); // create button
        window.add(button); // add button to window

        JPanel panel = new JPanel(); // create panel
        panel.setBackground(Color.LIGHT_GRAY); // give panel a colour
        window.add(panel); // add panel to window

        button.addActionListener(e ->{

        }); // tell code to listen to button

        frame.setVisible(true); // makes frame visible

    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        paper.drawLine(10, 20, 50, 50);
        paper.setColor(Color.WHITE);
    }
}