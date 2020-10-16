package Afvink6one.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Polarity extends JFrame implements ActionListener {

    private JButton openButton, saveButton;
    private JFileChooser fileChooser;
    private JTextField nameField;
    private JTextArea textArea;
    private JPanel panel;
    private BufferedReader inFile;

    public static void main(String[] args) {

        Polarity frame = new Polarity();
        frame.setSize(800, 800);
        frame.createGUI();
        frame.setVisible(true);

    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(null);

        openButton = new JButton("open");
        openButton.setBounds(420, 20, 100, 20);
        window.add(openButton);
        openButton.addActionListener(this);

        saveButton = new JButton("save");
        saveButton.setBounds(540, 20, 100, 20);
        window.add(saveButton);
        saveButton.addActionListener(this);

        nameField = new JTextField();
        nameField.setBounds(60, 20, 320, 20);
        window.add(nameField);

        textArea = new JTextArea();
        textArea.setBounds(20, 60, 740, 400);
        window.add(textArea);

        panel.setBounds(20, 500, 740, 240);
        panel.setBackground(Color.WHITE);
        window.add(panel);
    }

    public void readFile() {

        try {
            inFile = new BufferedReader(new FileReader(nameField.getText()));
            textArea.setText("");
            String line;
            while ((line = inFile.readLine()) != null) {
                textArea.append(line + "\n");
            }
            inFile.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "File Error: " + e.toString());
        }
    }

    public void actionPerformed(ActionEvent event) {
        File selectedFile;
        int reply;
        if (event.getSource() == saveButton) {
            fileChooser = new JFileChooser();
            reply = fileChooser.showSaveDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                nameField.setText(selectedFile.getAbsolutePath());
            }
        }
        if (event.getSource() == openButton) {
            fileChooser = new JFileChooser();
            reply = fileChooser.showOpenDialog(this);
            if (reply == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
                nameField.setText(selectedFile.getAbsolutePath());
                readFile();
            }
        }
    }
}


