package Afvink7;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Protein extends Sequence{
    public Protein(String sequence){
        super(sequence);
    }

    public void setColor() {
        Color[] col = new Color[this.sequence.length()];
        List<String> list_polar = Arrays.asList(SeqDecider.Polar);
        List<String> list_non_polar = Arrays.asList(SeqDecider.Nonpolar);
        List<String> list_acid = Arrays.asList(SeqDecider.Acidic);
        List<String> list_basic = Arrays.asList(SeqDecider.Basic);

        for (int i = 0; i < this.sequence.length(); i++) {
            String character = Character.toString(this.sequence.charAt(i));
            if (list_non_polar.contains(character)) { // apolair
                col[i] = Color.RED;
            }else if(list_polar.contains(character) ){ // polair
                col[i] = Color.BLUE;
            } else{
                 col[i] = Color.GRAY; // neutraal??
            }
        }
        this.color = col;
    }
}
