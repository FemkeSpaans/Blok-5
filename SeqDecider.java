package Afvink7;

import java.util.Arrays;

public class SeqDecider {
    static final String[] Aminoacids = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K"
            , "M", "F", "P", "S", "T", "W", "Y", "V"}; // array of one letter code amino acids
    static final String[] DNA = {"G", "C", "T", "A"}; // array of one letter code amino acids
    static final String[] RNA = {"G", "C", "U", "A"}; // array of one letter code amino acids
    static final String[] Polar = {"A", "G", "I", "L", "M", "F", "P", "W", "V"}; // polar amino acids
    static final String[] Nonpolar = {"N", "C", "Q", "S", "T", "Y"}; // nonpolar amino acids
    static final String[] Acidic = {"D", "E"};
    static final String[] Basic = {"R", "K", "H"};

//    public static void not_amino(String symbol) throws NotValidAmino {
//        // look at every element and compare it to aminoacids, if not in list throw NotAnAA
//        if (!(Arrays.toString(Aminoacids).contains(symbol))) {
//            throw new NotValidAmino("This is not an existing amino acid: " + symbol);
//        }
//    }
//
//    public static void not_dna(String symbol) throws NoValidSeq {
//        if (!(Arrays.toString(DNA).contains(symbol))) {
//            throw new NoValidSeq("This is not an existing nucleobase of DNA: " + symbol);
//        }
//    }
//
//    public static void not_rna(String symbol) throws NotValidRNA{
//        if (!(Arrays.toString(RNA).contains(symbol))) {
//            throw new NoValidSeq("This is not an existing nucleobase of RNA: " + symbol);
//        }
//    }
}


class NoValidSeq extends Exception {

    public NoValidSeq() {
        super();
    }

    public NoValidSeq(String err) {
        super(err);
    }
}

