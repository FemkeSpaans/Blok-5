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

        text1 = new JTextField("X"); // create textfield X
        text1.setColumns(5);
        JLabel label1 = new JLabel("Enter X value"); // create label X
        window.add(text1); // add textfield X to window
        window.add(label1); // add label X to window


        text2 = new JTextField("Y"); // create textfield Y
        text2.setColumns(5);
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
        paper.clearRect(0, 0, 600,500); //clears drawing field


        int x = Integer.parseInt(text1.getText()); // make text1 an int
        int y = Integer.parseInt(text2.getText()); // make text2 an int

        // carbon
        paper.setColor(Color.RED); // makes oval red
        paper.drawOval(x+45,y+45,30,30); // draws an oval in these dimensions
        paper.fillOval(x+45,y+45,30,30); // fill oval in these dimensions

        paper.setColor(Color.BLACK); // makes line black
        paper.drawLine(x+25,y+25,x+50,y+50);

        paper.drawLine(x+50, y+70,x+25,y+90);

        //hydrogen 1
        paper.setColor(Color.WHITE); // makes oval white
        paper.drawOval(x,y,30,30); // draws an oval in these dimensions
        paper.fillOval(x,y,30,30); // fill oval in these dimensions

        // hydrogen 2
        paper.drawOval(x, y+85,30,30); // draws an oval in these dimensions
        paper.fillOval(x, y+85,30,30); // fill oval in these dimensions

    }

}
