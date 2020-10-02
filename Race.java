package Afvink4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Race extends JFrame {

    static JFrame frame;
    static JButton race = new JButton("Race");



    public static void main(String[] args) {

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

        gui(h1, h2, h3, h4, h5);

    }

    public static void gui(Horse h1, Horse h2, Horse h3, Horse h4, Horse h5 ) {
        frame = new JFrame(); // create new object
        frame.getContentPane().setLayout(null);
        frame.setTitle("Horse Race"); // give title to frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing
        frame.setBounds(0, 0, 1920, 1080); // sets size of the frame
        frame.setVisible(true); // makes frame visible

        JLabel label = new JLabel("Click race to start");
        label.setBounds(150,10,300,20);
        frame.getContentPane().add(label);

        JProgressBar horse1 = new JProgressBar(0, 100);
        horse1.setForeground(h1.getColour());
        horse1.setBounds(150,50,600,100);
        frame.getContentPane().add(horse1);

        JProgressBar horse2 = new JProgressBar(0, 100);
        horse2.setForeground(h2.getColour());
        horse2.setBounds(150,170,600,100);
        frame.getContentPane().add(horse2);

        JProgressBar horse3 = new JProgressBar(0, 100);
        horse3.setForeground(h3.getColour());
        horse3.setBounds(150,290,600,100);
        frame.getContentPane().add(horse3);

        JProgressBar horse4 = new JProgressBar(0, 100);
        horse4.setForeground(h4.getColour());
        horse4.setBounds(150,410,600,100);
        frame.getContentPane().add(horse4);

        JProgressBar horse5 = new JProgressBar(0, 100);
        horse5.setForeground(h5.getColour());
        horse5.setBounds(150,530,600,100);
        frame.getContentPane().add(horse5);

        JButton race = new JButton("Race");
        race.addActionListener(e ->{
            boolean winner = false;
            while (!winner) {
                h1.loop();
                horse1.setValue(h1.getDistance());
                h2.loop();
                horse2.setValue(h2.getDistance());
                h3.loop();
                horse3.setValue(h3.getDistance());
                h4.loop();
                horse4.setValue(h4.getDistance());
                h5.loop();
                horse5.setValue(h5.getDistance());
                if(h1.getDistance()>= 100|| h2.getDistance()>=100|| h3.getDistance()>=100|| h4.getDistance()>=100||h5.getDistance()>=100){
                    winner = true;
                }
                if(h1.getDistance()>=100){
                    winner = true;
                    label.setText(h1.getName()+" wins");
                }
                if(h2.getDistance()>=100){
                    winner = true;
                    label.setText(h2.getName()+" wins");
                }
                if(h3.getDistance()>=100){
                    winner = true;
                    label.setText(h3.getName()+" wins");
                }
                if(h4.getDistance()>=100){
                    winner = true;
                    label.setText(h4.getName()+" wins");
                }
                if(h5.getDistance()>=100){
                    winner = true;
                    label.setText(h5.getName()+" wins");
                }
                try{
                    Thread.sleep(500);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        });
        race.setBounds(150,650,200,100);
        frame.getContentPane().add(race);

    }
}
