package Afvink6one.java;

import Afvink6.FileReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;

public class GUIPolarity extends JFrame implements ActionListener {
    public static void main(String[] args) {
        GUIPolarity frame = new GUIPolarity(); //create a new frame
        frame.setTitle("Polarity display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing
        frame.setSize(800, 800); // sets size of the frame
        frame.setLayout(null);
        frame.createGUI(); // calls to a different method called createGUI
        frame.setVisible(true); // makes frame visible

    }
    public void createGUI(){

        Container window = getContentPane();

        JLabel label = new JLabel();
        label.setBounds(20, 20, 40, 20);
        label.setText("File");
        window.add(label);

        JTextField textfield = new JTextField();
        textfield.setBounds(60, 20, 320, 20);
        window.add(textfield);


        JButton browse_button = new JButton();
        browse_button.setBounds(420, 20, 100, 20);
        browse_button.setText("Browse");
        browse_button.setBackground(Color.GRAY);
        browse_button.setForeground(Color.BLACK);
        window.add(browse_button);

        JTextArea textarea = new JTextArea();
        textarea.setBounds(20, 60,740, 400);
        window.add(textarea);

        JPanel panel = new JPanel();
        panel.setBounds(20, 500, 740, 240);
        panel.setBackground(Color.WHITE);
        window.add(panel);

        JButton analayse_button = new JButton();
        analayse_button.setBounds(540, 20, 100, 20);
        analayse_button.setText("Analyse");
        analayse_button.setBackground(Color.GRAY);
        analayse_button.setForeground(Color.BLACK);
        window.add(analayse_button);

        window.setVisible(true); // makes frame visible
        browse_button.addActionListener(this);
        analayse_button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource()==browse_button)
        {
            try {
                BufferedReader reader1 = FileReader.file();
                //textfield.setText(); display filename when file is chosen
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }
        else if (evt.getSource()==analayse_button)
        {
            try {
                BufferedReader reader1 = FileReader.file();
                FileReader.calculate(reader1);
                //textarea.setText(); // display contents of the file
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }
}
