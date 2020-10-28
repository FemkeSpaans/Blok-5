package Afvink7;

import java.util.Arrays;

public class SeqDecider {
    static final String[] Aminoacids = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K"
            , "M", "F", "P", "S", "T", "W", "Y", "V"}; // array of one letter code amino acids
    static final String[] DNA = {"G", "C", "T", "A"}; // array of one letter code amino acids
    static final String[] RNA = {"G", "C", "U", "A"}; // array of one letter code amino acids

    public static void not_amino(String symbol) throws NotValidAmino {
        // look at every element and compare it to aminoacids, if not in list throw NotAnAA
        if (!(Arrays.toString(Aminoacids).contains(symbol))) {
            throw new NotValidAmino("This is not an existing amino acid: " + symbol);
        }
    }

    public static void not_dna(String symbol) throws NotValidDNA{
        if (!(Arrays.toString(Aminoacids).contains(symbol))) {
            throw new NotValidDNA("This is not an existing nucleobase of DNA: " + symbol);
        }
    }

    public static void not_rna(String symbol) throws NotValidRNA{
        if (!(Arrays.toString(Aminoacids).contains(symbol))) {
            throw new NotValidRNA("This is not an existing nucleobase of RNA: " + symbol);
        }
    }
}

class NotValidAmino extends Exception {

    public NotValidAmino() {
        super();
    }

    public NotValidAmino(String err) {
        super(err);
    }
}

class NotValidDNA extends Exception {

    public NotValidDNA() {
        super();
    }

    public NotValidDNA(String err) {
        super(err);
    }
}

class NotValidRNA extends Exception {

    public NotValidRNA() {
        super();
    }

    public NotValidRNA(String err) {
        super(err);
    }
}