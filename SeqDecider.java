package Afvink7;

import java.util.Arrays;

public class SeqDecider {
    static final String[] Aminoacids = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K"
            , "M", "F", "P", "S", "T", "W", "Y", "V"}; // array of one letter code amino acids
    static final String[] DNA = {"G", "C", "T", "A"}; // array of one letter code amino acids
    static final String[] RNA = {"G", "C", "U", "A"}; // array of one letter code amino acids

    public static void not_amino_dna_rna(String symbol) throws NoValidSeq {
        // look at every element and compare it to aminoacids, if not in list throw NotAnAA
        if (!(Arrays.toString(Aminoacids).contains(symbol))) {
            throw new NoValidSeq("This is not an existing amino acid: " + symbol);
        }
        if(!(Arrays.toString(DNA).contains(symbol))){
            throw new NoValidSeq("This is not an existing nucleobase of DNA: " + symbol);
        }
        if(!(Arrays.toString(RNA).contains(symbol))){
            throw new NoValidSeq("This is not an existing nucleobase of RNA: " + symbol);
        }
    }
}

class NoValidSeq extends Exception {

    public NoValidSeq() {
        super();
    }

    public NoValidSeq(String err) {
        super(err);
    }
}
