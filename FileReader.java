package Afvink6;

import javax.swing.*;
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;


public class FileReader {
    BufferedReader reader;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = file();
        calculate(reader);
    }

    public static BufferedReader file() throws IOException {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File file = chooser.getSelectedFile();
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        return reader;

    }

    public static void calculate(BufferedReader reader) throws IOException {
        String line;

        int total_amino_acids = 0;
        int polar_amino_acids = 0;
        int nonpolar_amino_acids = 0;


        while ((line = reader.readLine()) != null) {// while there are line to go
            total_amino_acids += line.length(); // add 1 to this int
            List<String> list_polar = Arrays.asList(Aminoacids.Polar);
            List<String> list_non_polar = Arrays.asList(Aminoacids.Nonpolar);
            for (int i = 0; i < line.length(); i++) {
                char var = line.charAt(i);
                String var1 = Character.toString(var);
                if (list_polar.contains(var1)) {
                    polar_amino_acids++;
                }
                if (list_non_polar.contains(var1)) {
                    nonpolar_amino_acids++;
                }

            }
        }
        System.out.println(total_amino_acids);
        System.out.println(polar_amino_acids);
        System.out.println(nonpolar_amino_acids);
    }
}


