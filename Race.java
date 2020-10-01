package Afvink4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Race extends JFrame {

    static JFrame frame;

    public static void main(String[] args) {
        frame();

    }

    public static void frame(){
        frame = new JFrame(); // create new object
        frame.getContentPane().setLayout(null);
        frame.setTitle("Horse Race"); // give title to frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing
        frame.setBounds(0, 0, 1920, 1080); // sets size of the frame
        frame.setVisible(true); // makes frame visible

        JLabel label = new JLabel("Why are you not showing up?");
        label.setBounds(860,1900,300,300);
        frame.getContentPane().add(label);

        JProgressBar horse1 = new JProgressBar(0, 100);
        horse1.setBounds(150,100,600,100);
        frame.getContentPane().add(horse1);

        JProgressBar horse2 = new JProgressBar(0, 100);
        horse2.setBounds(150,220,600,100);
        frame.getContentPane().add(horse2);
        
        JProgressBar horse3 = new JProgressBar(0, 100);
        horse3.setBounds(150,340,600,100);
        frame.getContentPane().add(horse3);
        
        JProgressBar horse4 = new JProgressBar(0, 100);
        horse4.setBounds(150,460,600,100);
        frame.getContentPane().add(horse4);
        
        JProgressBar horse5 = new JProgressBar(0, 100);
        horse5.setBounds(150,580,600,100);
        frame.getContentPane().add(horse5); 

        JButton race = new JButton("Race");
        //race.addActionListener();
        race.setBounds(860,1500,200,200);
        frame.getContentPane().add(race);

        JButton reset = new JButton("Reset");
        //reset.addActionListener();
        reset.setBounds(860,1100,200,200);
        frame.getContentPane().add(reset);

        JButton quit = new JButton("Quit");
        //quit.addActionListener();
        quit.setBounds(860,800,200,200);
        frame.getContentPane().add(quit);


    }

    public void horses() {

        Horse h1;
        h1 = new Horse();
        h1.setName("Shadowfax");
        h1.setBreed("Mearas");
        h1.setColour(Color.WHITE);

        Horse h2;
        h2 = new Horse();
        h2.setName("Black Beauty");
        h2.setBreed("American Quarter Horse");
        h2.setColour(Color.BLACK);

        Horse h3;
        h3 = new Horse();
        h3.setName("Alfonso");
        h3.setBreed("Lipizzan");
        h3.setColour(Color.GRAY);

        Horse h4;
        h4 = new Horse();
        h4.setName("Frou Frou");
        h4.setBreed("Palomino");
        h4.setColour(Color.YELLOW);

        Horse h5;
        h5 = new Horse();
        h5.setName("Seabiscuit");
        h5.setBreed("American Racehorse");
        h5.setColour(Color.ORANGE);
    }
}
