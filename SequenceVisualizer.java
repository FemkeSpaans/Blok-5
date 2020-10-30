package Afvink7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SequenceVisualizer extends JFrame implements ActionListener {
    static JButton browse_button;
    static JLabel label = new JLabel();
    static JTextField textfield = new JTextField();
    static JTextArea textarea = new JTextArea();
    static JPanel panel = new JPanel();
    BufferedReader inFile;
    JFileChooser fileChooser;
    static DNA dna;
    static RNA rna;
    static Protein protein;

    public static void main(String[] args) {
        SequenceVisualizer frame = new SequenceVisualizer(); //create a new frame
        frame.setTitle("Sequence Visualisation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close frame when closing
        frame.setSize(800, 800); // sets size of the frame
        frame.setLayout(null);
        frame.createGUI(); // calls to a different method called createGUI
        frame.setVisible(true); // makes frame visible
    }

    public void createGUI() {
        Container window = getContentPane();

        label.setBounds(20, 20, 40, 20);
        label.setText("File");
        window.add(label);

        textfield.setBounds(60, 20, 320, 20);
        window.add(textfield);

        browse_button = new JButton();
        browse_button.setBounds(420, 20, 100, 20);
        browse_button.setText("Browse");
        browse_button.setBackground(Color.GRAY);
        browse_button.setForeground(Color.BLACK);
        window.add(browse_button);
        browse_button.addActionListener(this);

        textarea.setBounds(20, 60, 740, 400);
        window.add(textarea);

        panel = new JPanel();
        panel.setBounds(20, 500, 740, 240);
        panel.setBackground(Color.WHITE);
        window.add(panel);
    }

    public void readFile() throws IOException {
        inFile = new BufferedReader(new FileReader(textfield.getText()));
        textarea.setText("");
        String line;
        line = inFile.readLine();
        while (line != null) { // while there are lines to go
            textarea.append(line + "\n");

            if (line.startsWith(">")) {// this never goes to the else if statement
            } else if (!line.startsWith(">")) {
//                List<String> list_amino = Arrays.asList(SeqDecider.Aminoacids);
//                List<String> list_dna = Arrays.asList(SeqDecider.DNA);
//                List<String> list_rna = Arrays.asList(SeqDecider.RNA);
                for (int i = 0; i < line.length(); i++) {
                    char var = line.charAt(i);
                    //String var1 = Character.toString(var);
//                    SeqDecider.not_amino(var1);
//                    SeqDecider.not_dna(var1);
//                    SeqDecider.not_rna(var1);
                    if (textarea.getText().matches("^[ATCG]*$")) {
                        is_dna();
                    }
                    else if (textarea.getText().matches("^[AUCG]*$")) {
                        is_rna();
                    }
                    else if (textarea.getText().matches("^[ARNDCQGEHILKMFPSTWYV]*$")) {
                        is_protein();
                    } else{
                        try {
                            throw new NoValidSeq();
                        } catch (NoValidSeq e) {
                            textarea.setText(e.toString());
                        }

                    }
                }
            }
            line = inFile.readLine();
        }
        inFile.close();
    }

    public static void is_dna() {
        dna = new DNA(textarea.getText());
        draw();
    }

    public static void is_rna() {
        rna = new RNA(textarea.getText());
        draw();
    }

    public static void is_protein() {
        protein = new Protein(textarea.getText());
        draw();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        File selectedFile;
        int reply;
        if (event.getSource() == browse_button) {
            fileChooser = new JFileChooser();
            reply = fileChooser.showOpenDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                textfield.setText(selectedFile.getAbsolutePath());
                try {
                    readFile();
                } catch (IOException e) {
                    textarea.setText(e.toString());
                }
            }
        }
    }

    public static void draw() {
        Graphics paper = panel.getGraphics();
        paper.clearRect(20, 500, 740, 240); //clears drawing field
        float length;
        Color[] colorArray;
        if (dna != null) {
            length = (float) dna.getLength();
            dna.setColor();
            colorArray = dna.getColor();
        } else if (rna != null) {
            length = (float) rna.getLength();
            rna.setColor();
            colorArray = rna.getColor();
        } else {
            length = (float) protein.getLength();
            protein.setColor();
            colorArray = protein.getColor();
        }
        //System.out.println(Arrays.toString(colorArray));
        int position = 0;
        int width = Math.round(1f / length * 740); //visualisation might not fit the frame because the round up.
//        System.out.println(1f / length * 740);
//        System.out.println(width);
        for (int i = 0; i < length; i++) {
            paper.setColor(colorArray[i]);
            paper.fillRect(position, 0, width, 100);
            position += width;
        }
        dna = null;
        rna = null;
        protein = null;
    }
}




