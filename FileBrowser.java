package Afvink6;

import java.io.*;
import javax.swing.*;

    public class FileBrowser {
        public static void main(String[] args) {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File file = chooser.getSelectedFile();
            String filename = file.getName();
            System.out.println("You have selected: " + filename);
        }
    }

