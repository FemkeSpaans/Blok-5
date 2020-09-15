import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H2O extends JFrame implements ActionListener {


    private static void createAndShowGUI(){
        JButton button; // creates a component
        JTextField textArea;
        JPanel panel;

        JFrame frame = new JFrame("H2O"); // create a new jframe
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing

        frame.setSize(1000,1000);// set size of the frame

        JButton btn = new JButton("Submit");
        JTextField textx = new JTextField("x");
        JTextField texty = new JTextField("y");

        btn.addActionListener(e -> {
            System.out.println("piefh");
        });
        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
        btn.setPreferredSize(new Dimension(100, 100));
        textx.setPreferredSize(new Dimension(100,100));
        texty.setPreferredSize(new Dimension(100,100));
        frame.add(btn, BorderLayout.SOUTH);
        frame.add(textx, BorderLayout.EAST);
        frame.add(texty, BorderLayout.WEST);

        frame.setVisible(true);// show frame


    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();// run create and show gui
            }

        });


    }

    public void actionPerformed(ActionEvent actionEvent) {
        //Graphics paper = panel.getGraphics();
        //paper.drawLine(10,20,50,50);
        //paper.setColor(Color.WHITE);
        //paper.drawString(textArea.getText(),70,80);

    }
}
