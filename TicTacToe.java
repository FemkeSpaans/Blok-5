package Afvink3;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToe extends JFrame implements ActionListener {

    int alternate = 0;
    JButton buttons[] = new JButton[9];



    public static void main(String[] args) {
        createFrame();

    }


    public void checkWinner(){
        int [][] list = new int[3][3];
        // check rows
        //List topRow = Arrays.asList(1,2,3);
        // check columns
        // check diagonal


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

        for(int i = 0; i < 9; i++) {
            window.add(new JButton());
            buttons[i].setText("");
            buttons[i].addActionListener(this); 

        }


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
