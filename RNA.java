package Afvink7;

import java.awt.*;

public class RNA extends Sequence {
    public RNA(String sequence) {
        super(sequence);
    }

    public void setColor() {
        Color[] col = new Color[this.sequence.length()];
        for (int i = 0; i < this.sequence.length(); i++) {
            String character = Character.toString(this.sequence.charAt(i));
            if (character.equals("C") || character.equals("G")) {
                col[i] = Color.RED;
            }
            else if (character.equals("A")){
                col[i] = Color.YELLOW;
            } else {
                col[i] = Color.BLUE;
            }
        }
        this.color = col;
    }
}

