package Afvink6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        file();
    }

    public static void file() throws FileNotFoundException {
        File file = new File("C:\\Users\\FSpaa\\IdeaProjects\\PractiseRoundOne\\src\\Afvink6\\alpha_amylase.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}