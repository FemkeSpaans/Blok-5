package Afvink6one.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class GUIPolarity extends JFrame implements ActionListener {
    JButton browse_button, analayse_button;
    JLabel label = new JLabel();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    static JPanel panel = new JPanel();
    BufferedReader inFile;
    JFileChooser fileChooser;

    public static void main(String[] args) {
        GUIPolarity frame = new GUIPolarity(); //create a new frame
        frame.setTitle("Polarity display");
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

        analayse_button = new JButton();
        analayse_button.setBounds(540, 20, 100, 20);
        analayse_button.setText("Analyse");
        analayse_button.setBackground(Color.GRAY);
        analayse_button.setForeground(Color.BLACK);
        window.add(analayse_button);
        analayse_button.addActionListener(this);

        textarea.setBounds(20, 60, 740, 400);
        window.add(textarea);

        panel = new JPanel();
        panel.setBounds(20, 500, 740, 240);
        panel.setBackground(Color.WHITE);
        window.add(panel);
    }

    public float[] readFile() throws IOException, NotAnAA {
        inFile = new BufferedReader(new FileReader(textfield.getText()));
        textarea.setText("");
        String line;

        int total_amino_acids = 0;
        int polar_amino_acids = 0;
        int nonpolar_amino_acids = 0;

        line = inFile.readLine();
        while (line != null) { // while there are lines to go
            textarea.append(line + "\n");
            if (line.startsWith(">")) {// this never goes to the else if statement
            } else if (!line.startsWith(">")) {
                total_amino_acids += line.length(); // add 1 to this int
                List<String> list_polar = Arrays.asList(AminoAcids.Polar);
                List<String> list_non_polar = Arrays.asList(AminoAcids.Nonpolar);
                for (int i = 0; i < line.length(); i++) {
                    char var = line.charAt(i);
                    String var1 = Character.toString(var);
                    AminoAcids.not_amino_acid(var1);
                    if (list_polar.contains(var1)) {
                        polar_amino_acids++;
                    }
                    if (list_non_polar.contains(var1)) {
                        nonpolar_amino_acids++;
                    }
                }
            }
            line = inFile.readLine();
        }
        textarea.append("The number of amino acids in this file is: "+total_amino_acids);
        textarea.append("\nThe number of polar amino acids in this file is: "+polar_amino_acids);
        textarea.append("\nThe number of non polar amino acids in this file is: "+nonpolar_amino_acids);

        float total_amino_acids1 = total_amino_acids;
        float polar_amino_acids1 = polar_amino_acids;
        float nonpolar_amino_acids1 = nonpolar_amino_acids;
        float percentage_polar = polar_amino_acids1 / total_amino_acids1 * 100;
        float percentage_non_polar = nonpolar_amino_acids1 / total_amino_acids1 * 100f;
        float[] percentages = {percentage_non_polar, percentage_polar};
        inFile.close();
        draw(percentages);
        return percentages;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        File selectedFile;
        int reply;
        if (evt.getSource() == browse_button) {
            fileChooser = new JFileChooser();
            reply = fileChooser.showSaveDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) { // if value is true file is chosen
                selectedFile = fileChooser.getSelectedFile(); // gets the selected file
                textfield.setText(selectedFile.getAbsolutePath()); // gets the absolute path of the file selected
            }
        }
        if (evt.getSource() == analayse_button) { // gets the source of the thing which is pressed, if it is analysebutton it continues
            fileChooser = new JFileChooser();
            reply = fileChooser.showOpenDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                textfield.setText(selectedFile.getAbsolutePath());
                try {
                    readFile();
                } catch (IOException | NotAnAA e) {
                    textarea.setText(e.toString());
                }
            }
        }

    }

    public static void draw(float[] percentages) {
        // pass along percentage polar and percentage nonpolar, round both to two decimals
        // create two rectangles
        // file both rectangles with the appropriate percentages
        int polar = Math.round(percentages[0]);
        int non_polar = Math.round(percentages[1]);
        System.out.println(polar);
        System.out.println(non_polar);

        Graphics paper = panel.getGraphics();
        paper.clearRect(20, 500, 740, 240); //clears drawing field

        paper.setColor(Color.cyan);
        paper.drawRect(0, 0, 600, 50);
        paper.fillRect(0, 0, (600 * polar/100), 50);

        paper.setColor(Color.orange);
        paper.drawRect(0, 60, 600, 50);
        paper.fillRect(0, 60, (600 * non_polar/100), 50); // must be between 0.0 and 1.0

    }
}


