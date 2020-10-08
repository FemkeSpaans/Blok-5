package Afvink5;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class OneTwoThree extends JFrame {
    public static void main(String[] args) {
        frame();
        //change();
        //print();
    }

    public static void frame(){
        JFrame frame = new JFrame(); // create new object
        frame.getContentPane().setLayout(null);
        frame.setTitle("Translator"); // give title to frame
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing


        JTextField textfield = new JTextField();
        textfield.setBounds(20,20, 360,50);
        frame.add(textfield);

        JButton button = new JButton();
        button.setText("Submit");
        button.setBounds(140,90, 100,50);
        frame.add(button);
        button.addActionListener(e ->{
            //Scanner input = new Scanner(System.in);
            String text = textfield.getText();
            for(int i =0; i < text ; i++){
                System.out.println(text);
            }
        });
        JLabel label = new JLabel();
        label.setBounds(20, 180, 360, 100);
        frame.add(label);

        frame.setVisible(true); // makes frame visible

    }
}
