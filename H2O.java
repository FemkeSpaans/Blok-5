import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/* the code below will show a gui
where a water molecule can be seen depicted on the screen
 */
public class H2O extends JFrame implements ActionListener {
    private JPanel panel;

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

        JTextField text1 = new JTextField("X axis");
        JTextField text2 = new JTextField("Y axis");
        window.add(text1);
        window.add(text2);

//        JLabel label1 = new JLabel("Enter X value"); // create label X
//        JLabel label2 = new JLabel("Enter Y value"); // create label Y
//        window.add(label1); // add label X to window
//        window.add(label2); // add label Y to window

        JButton button = new JButton("Submit"); // create button
        window.add(button); // add button to window

        panel = new JPanel(); // create a new panel
        panel.setPreferredSize(new Dimension(600, 500)); // set panel size
        panel.setBackground(Color.LIGHT_GRAY); // give panel a colour
        window.add(panel); // add panel to window

        button.addActionListener(e ->{

        }); // tell code to listen to button

    }

    /*
    Listen for when the button is pushed,
    then performs the next action,
    by drawing a water molecule.
     */
    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        super.paintComponents(paper);

        paper.setColor(Color.RED); // makes oval red
        paper.drawOval(40, 40, 60, 60); // draws an oval in these dimensions
        paper.fillOval(40,40,60,60);

        paper.setColor(Color.BLACK); // makes line black
        paper.drawLine(10, 10, 40, 10);

        paper.setColor(Color.WHITE); // makes oval white
        paper.drawOval(20,20,30,30);
        paper.fillOval(20,20,30,30);


    }

}