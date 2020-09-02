// Author: Femke Spaans
// Date: 02.09.2020

import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;


public class Afvink3 {
    private static Object JButton;

    public static void main(String[] args) {

        // Create Grid.
        super(new GridLayout(10, 20));
        JButton, JFrame;
        
        // Create the frame.
        JFrame frame = new JFrame("FrameDemo");

        // Close frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components and put them in the frame.
        JTextField textField = new JTextField(20);

        // Add button.
        JButton button = new JButton("Submit");

        button.setPreferredSize(new Dimension(40, 40));


        // Give the frame a size.
        frame.getContentPane().setPreferredSize(new Dimension(500, 500));


        // Add text field to frame.
        frame.getContentPane().add(textField);
        frame.getContentPane().add(button);

        // Size the frame.
        frame.pack();

        // Show frame.
        frame.setVisible(true);


    }
}