package Afvink7;

import java.awt.*;

public class DNA extends Sequence {
    public DNA(String sequence) {
        super(sequence);
    }

    public void setColor() {
        Color[] col = new Color[this.sequence.length()];
        for (int i = 0; i < this.sequence.length(); i++) {
            String character = Character.toString(this.sequence.charAt(i));
            if (character.equals("C") || character.equals("G")) {
                col[i] = Color.RED;
            } else {
                col[i] = Color.YELLOW;
            }
        }
        this.color = col;
    }
}
