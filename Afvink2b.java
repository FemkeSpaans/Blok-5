// Author: Femke Spaans
// Date: 01.09.2020

import javax.swing.*;
import java.util.Scanner;

public class Afvink2b {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name");
        String name = myObj.nextLine();
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}


