package Afvink6;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Translator6 {
    public static void main(String[] args) {
        frame();

    }
    public static void frame(){
        JFrame frame = new JFrame(); // create new object
        frame.getContentPane().setLayout(null);
        frame.setTitle("Translator of aminoacids and polarity"); // give title to frame
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing

        JLabel label = new JLabel();
        label.setBounds(20, 20, 40, 20);
        label.setText("File");
        frame.add(label);

        JTextField textfield = new JTextField();
        textfield.setBounds(60, 20, 320, 20);
        frame.add(textfield);

        JButton browse_button = new JButton();
        browse_button.setBounds(420, 20, 100, 20);
        browse_button.setText("Browse");
        browse_button.setBackground(Color.GRAY);
        browse_button.setForeground(Color.BLACK);
        frame.add(browse_button);
        browse_button.addActionListener(e ->{
            try {
                FileReader.file();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

        JButton analayse_button = new JButton();
        analayse_button.setBounds(540, 20, 100, 20);
        analayse_button.setText("Analyse");
        analayse_button.setBackground(Color.GRAY);
        analayse_button.setForeground(Color.BLACK);
        frame.add(analayse_button);
        analayse_button.addActionListener(e ->{
            FileReader.calculate(reader);
        });

        JTextArea textarea = new JTextArea();
        textarea.setBounds(20, 60,740, 400);
        frame.add(textarea);

        JPanel panel = new JPanel();
        panel.setBounds(20, 500, 740, 240);
        panel.setBackground(Color.WHITE);
        frame.add(panel);

        frame.setVisible(true); // makes frame visible
    }
            }
