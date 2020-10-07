package Afvink5;

/** Translator voor de opdracht One2Three
 * Gebruik deze code ongewijzigd om een
 * vertaler te maken van de eenletterige code
 * voor een aminozuur naar de drieletterige
 * code van een aminozuur.
 * @Author Martijn van der Bruggen
 * @Date  1-september-2019
 */


public class Translator {

    static final String[] ONE = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K"
            , "M", "F", "P", "S", "T", "W", "Y", "V"}; // array of one letter code amino acids
    static final String[] THREE = {"ALA", "ARG", "ASN", "ASP", "CYS", "GLN", "GLU", "GLY"
            ,"HIS", "ILE", "LEU", "LYS", "MET", "PHE", "PRO", "SER"
            ,"THR", "TRP", "TYR", "VAL"}; // array of three letter code amino acids

    public static String one2three(String symbol) throws NotAnAA {
        String threeCode = "";
        for (int i = 0; i < ONE.length; i++) { // i is zero, when i is smaller than the length of ONE, i plus one
            if (ONE[i].equals(symbol)) { // if one equals the right symbol,
                threeCode = THREE[i]; // it will look for the symbol in THREE
            }

        }
        if (threeCode.equals("")) {
            throw new NotAnAA("Dit is een niet bestaand aminozuur: " + symbol);
        }
        return threeCode;
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
