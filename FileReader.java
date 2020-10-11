package Afvink6;

import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;


public class FileReader {
    public static void main(String[] args) throws IOException {
        file();
    }

    public static void file() throws IOException {
        File file = new File("C:\\Users\\FSpaa\\IdeaProjects\\PractiseRoundOne\\src\\Afvink6\\alpha_amylase.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

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
                Character.toString(var);
                if(list_polar.contains(var)){
                    polar_amino_acids++;
                }
                if(list_non_polar.contains(var)){
                    nonpolar_amino_acids++;
                }
//                if(Aminoacids.Polar.contains(var))
//                if (var.equals(Aminoacids.Polar)) {
//                    polar_amino_acids++;
//                }
//                if (var.equals(Aminoacids.Nonpolar)) {
//                    nonpolar_amino_acids++;
//                }
            }
            System.out.println(total_amino_acids);
            System.out.println(polar_amino_acids);
            System.out.println(nonpolar_amino_acids);
//        Scanner scan = new Scanner(file);
//        while (scan.hasNextLine()) {
//            System.out.println(scan.nextLine());
//        }
        }
    }
}