import javax.swing.*;
import java.awt.*;

public class Afvink3c extends JFrame {
    public static void main(String[] args) {
        createGUI();
    }

    public static void createGUI() {
        JFrame frame = new JFrame("mooi");

        JPanel panel = new JPanel(); // create panel
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Say something"); // create label
        panel.add(label); // add label
        JTextField textField = new JTextField("Like right here"); // create textfield
        panel.add(textField); // add textfield
        frame.add(panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE); // close window when hitting close button
        frame.setVisible(true);
        frame.setSize(500, 500); // set size for gui


    }
}
