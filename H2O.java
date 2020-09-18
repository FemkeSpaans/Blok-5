import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/* the code below will show a gui
where a water molecule can be seen depicted on the screen
 */
public class H2O extends JFrame implements ActionListener {
    private JPanel panel;
    public JTextField text1, text2;

/* main in which the base of the gui is created
using a frame
 */
    public static void main(String[] args) {
        H2O frame = new H2O(); //create a new frame
        frame.setTitle("H2O");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing
        frame.setSize(800, 700); // sets size of the frame
        frame.createGUI(); // calls to a different method called createGUI
        frame.setVisible(true); // makes frame visible

    }

    public void createGUI(){
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        JTextField text1 = new JTextField("X"); // create textfield X
        JLabel label1 = new JLabel("Enter X value"); // create label X
        window.add(text1); // add textfield X to window
        window.add(label1); // add label X to window


        JTextField text2 = new JTextField("Y"); // create textfield Y
        JLabel label2 = new JLabel("Enter Y value"); // create label Y
        window.add(text2); // add textfield Y to window
        window.add(label2); // add label Y to window

        JButton button = new JButton("Submit"); // create button
        window.add(button); // add button to window

        panel = new JPanel(); // create a new panel
        panel.setPreferredSize(new Dimension(600, 500)); // set panel size
        panel.setBackground(Color.LIGHT_GRAY); // give panel a colour
        window.add(panel); // add panel to window

        button.addActionListener(this); // tell code to listen to button

    }

    /*
    Listen for when the button is pushed,
    then performs the next action,
    by drawing a water molecule.
     */
    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();

        int x = Integer.parseInt(text1.getText());
        int y = Integer.parseInt(text2.getText());

        // carbon
        paper.setColor(Color.RED); // makes oval red
        paper.drawOval(40, 40, 60, 60); // draws an oval in these dimensions
        paper.fillOval(x + 62, y + 62, 76, 76);

        paper.setColor(Color.BLACK); // makes line black
        paper.drawLine(x + 25, y + 25, x + 100, y + 100);

        paper.drawLine(x + 100, y + 100, x + 25, y + 175);

        //hydrogen 1
        paper.setColor(Color.WHITE); // makes oval white
        paper.drawOval(20,20,50,50);
        paper.fillOval(x,y,50,50);

        // hydrogen 2
        paper.drawOval(20,20,50,50);
        paper.fillOval(x,y,50,50);

    }

}
