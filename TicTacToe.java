package Afvink3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {

    Random random = new Random();
    static JPanel titlePanel = new JPanel();
    static JPanel buttonPanel = new JPanel();
    JButton [] buttons = new JButton[9];
    static JLabel textField = new JLabel();
    boolean player1 = true;
    public static void main(String[] args) {
        createFrame();
    }

    /*
    create frame for the buttons
     */
    public static void createFrame(){
        TicTacToe frame = new TicTacToe();
        frame.setTitle("Tic Tac Toe"); // give title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing
        frame.setSize(500, 500); // sets size of the frame
        frame.getContentPane();
        frame.setLayout(new BorderLayout());// give frame a border layout
        frame.setResizable(false);// frame cannot be made any bigger or smaller than it is
        frame.setVisible(true); // makes frame visible

        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("TicTacToe");
        titlePanel.setLayout(new BorderLayout()); // create border layout for text field and title panel
        titlePanel.setBounds(0,0,500,100);

        titlePanel.add(textField);
        frame.add(titlePanel,BorderLayout.NORTH);
        frame.add(buttonPanel);
        frame.createButtons(); // calls to a different method called createGUI
        frame.turn();


    }

    /*
    create 9 buttons
     */
    public void createButtons(){
        buttonPanel.setLayout(new GridLayout(3,3));
        for(int i = 0; i < 9; i++) { // for loop to create 9 new buttons
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Dialog",Font.BOLD, 80));
            buttons[i].setBackground(Color.GRAY);
            buttons[i].setText("");
            buttons[i].addActionListener(this);
            add(buttons[i]);

        }
    }
     public void turn(){
         try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         if(random.nextInt(2)==0) {
            player1=true;
             textField.setText("X turn");
        }
        else {
            player1=false;
             textField.setText("O turn");

        }
     }


    public void checkWinner(){
        // check X win conditions
        if(
                (buttons[0].getText().equals("X")) &&
                        (buttons[1].getText().equals("X")) &&
                        (buttons[2].getText().equals("X")) // check first row from X
        ) {
            xWins(0,1,2);
        }
        if(
                (buttons[3].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[5].getText().equals("X")) // check second row from X
        ) {
            xWins(3,4,5);
        }
        if(
                (buttons[6].getText().equals("X")) &&
                        (buttons[7].getText().equals("X")) &&
                        (buttons[8].getText().equals("X")) // check third row from X
        ) {
            xWins(6,7,8);
        }
        if(
                (buttons[0].getText().equals("X")) &&
                        (buttons[3].getText().equals("X")) &&
                        (buttons[6].getText().equals("X")) // check first column from X
        ) {
            xWins(0,3,6);
        }
        if(
                (buttons[1].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[7].getText().equals("X")) // check second column from X
        ) {
            xWins(1,4,7);
        }
        if(
                (buttons[2].getText().equals("X")) &&
                        (buttons[5].getText().equals("X")) &&
                        (buttons[8].getText().equals("X")) // check third column from X
        ) {
            xWins(2,5,8);
        }
        if(
                (buttons[0].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[8].getText().equals("X")) // check diagonal 1 from X
        ) {
            xWins(0,4,8);
        }
        if(
                (buttons[2].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[6].getText().equals("X")) //check diagonal 2 from X
        ) {
            xWins(2,4,6);
        }

        //check O win conditions
        if(
                (buttons[0].getText().equals("O")) &&
                        (buttons[1].getText().equals("O")) &&
                        (buttons[2].getText().equals("O")) // check first row from O
        ) {
            oWins(0,1,2);
        }
        if(
                (buttons[3].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[5].getText().equals("O")) // check second row from O
        ) {
            oWins(3,4,5);
        }
        if(
                (buttons[6].getText().equals("O")) &&
                        (buttons[7].getText().equals("O")) &&
                        (buttons[8].getText().equals("O")) // check third row from O
        ) {
            oWins(6,7,8);
        }
        if(
                (buttons[0].getText().equals("O")) &&
                        (buttons[3].getText().equals("O")) &&
                        (buttons[6].getText().equals("O")) // check first column from O
        ) {
            oWins(0,3,6);
        }
        if(
                (buttons[1].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[7].getText().equals("O")) // check second column from O
        ) {
            oWins(1,4,7);
        }
        if(
                (buttons[2].getText().equals("O")) &&
                        (buttons[5].getText().equals("O")) &&
                        (buttons[8].getText().equals("O")) // check third column from O
        ) {
            oWins(2,5,8);
        }
        if(
                (buttons[0].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[8].getText().equals("O")) // check diagonal 1 from O
        ) {
            oWins(0,4,8);
        }
        if(
                (buttons[2].getText().equals("O")) &&
                        (buttons[4].getText().equals("O")) &&
                        (buttons[6].getText().equals("O")) // check diagonal 2 from O
        ) {
            oWins(2,4,6);
        }
        if(
                (buttons[0].getText()!=("")) &&
                        (buttons[1].getText()!=("")) &&
                        (buttons[2].getText()!=("")) &&
                        (buttons[3].getText()!=("")) &&
                        (buttons[4].getText()!=("")) &&
                        (buttons[5].getText()!=("")) &&
                        (buttons[6].getText()!=("")) &&
                        (buttons[7].getText()!=("")) &&
                        (buttons[8].getText()!=(""))) // check if board is full and if so send to draw
        {
            draw();
        }
    }


    public void xWins(int a, int b, int c){
        for(int i=0;i<9;i++) {
            buttons[i].setEnabled(false);
        }
        System.out.println("X wins");
    }

    public void oWins(int a, int b, int c){
        for(int i=0;i<9;i++) {
            buttons[i].setEnabled(false);
        }
        System.out.println("O wins");
    }

    public void draw(){

        System.out.println("It's a draw");
    }


    public void actionPerformed(ActionEvent e) {
        for(int i = 0;i<9;i++){
            if(e.getSource()==buttons[i]){
                if(player1){
                    if(buttons[i].getText().equals("")){
                        buttons[i].setText("X");
                        player1 = false;
                        checkWinner();
                    }
                }
                else if(buttons[i].getText().equals("")) {
                        buttons[i].setText("O");
                        player1=true;
                        checkWinner();
                }
            }
        }
    }
}
