package Afvink7;

import java.awt.*;

public abstract class Sequence {
    public String sequence;
    protected Color[] color;


    public Sequence(String sequence) {
        this.sequence = sequence;
    }
/*public enum Color {
    RED(Color.RED),
    BLUE(Color.BLUE),
    GREY(Color.GREY),
    YELLOW(Color.YELLOW);

    private final Color color;

    Color(Color color) {
        this.color = color;
    }

    public Color getColor(){
        return color;
    }
}*/
    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Color[] getColor() {
        return this.color;
    }

    public String getSequence() {
        return this.sequence;
    }

    public int getLength() {
        return this.sequence.length();
    }

}

