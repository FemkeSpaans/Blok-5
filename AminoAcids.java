package Afvink6one.java;

import java.util.Arrays;

public class AminoAcids {
    static final String[] Aminoacids = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K"
            , "M", "F", "P", "S", "T", "W", "Y", "V"}; // array of one letter code amino acids

    static final String[] Polar = {"A", "G", "I", "L", "M", "F", "P", "W", "V"}; // polar amino acids

    static final String[] Nonpolar = {"N", "C", "Q", "S", "T", "Y"}; // nonpolar amino acids

    static final String[] Acidic = {"D", "E"};

    static final String[] Basic = {"R", "K", "H"};


    public static void not_amino_acid(String symbol) throws NotAnAA {
        // look at every element and compare it to aminoacids, if not in list throw NotAnAA
        if (!(Arrays.toString(Aminoacids).contains(symbol))) {
            throw new NotAnAA("This is not an existing amino acid: " + symbol);
        }
    }
}

class NotAnAA extends Exception {

    public NotAnAA() {
        super();
    }

    public NotAnAA(String err) {
        super(err);
    }
}