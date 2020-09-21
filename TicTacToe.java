package Afvink3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {

    int alternate = 0;



    public static void main(String[] args) {
        createFrame();

    }


    public void checkWinner(){


    }


    /*
    create frame for the buttons
     */
    public static void createFrame(){
        TicTacToe frame = new TicTacToe();
        frame.setTitle("Tic Tac Toe"); // give title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing
        frame.setSize(600, 500); // sets size of the frame
        frame.createGUI(); // calls to a different method called createGUI
        frame.setVisible(true); // makes frame visible

    }


    /*
    create 9 buttons
     */
    public void createGUI(){
        Container window = getContentPane();
        window.setLayout(new GridLayout(3,3));

        JButton buttonOne = new JButton();
        JButton buttonTwo = new JButton();
        JButton buttonThree = new JButton();
        JButton buttonFour = new JButton();
        JButton buttonFive = new JButton();
        JButton buttonSix = new JButton();
        JButton buttonSeven = new JButton();
        JButton buttonEight = new JButton();
        JButton buttonNine = new JButton();

        window.add(buttonOne);
        window.add(buttonTwo);
        window.add(buttonThree);
        window.add(buttonFour);
        window.add(buttonFive);
        window.add(buttonSix);
        window.add(buttonSeven);
        window.add(buttonEight);
        window.add(buttonNine);

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton)e.getSource();
        if(alternate%2 == 0)
            buttonClicked.setText("X");
        else
            buttonClicked.setText("O");

        alternate ++; 

    }
}
