package Afvink7;

public abstract class Sequence {
    public String sequence;

    public void Sequence(String sequence) {
        this.sequence = sequence;
    }
public enum Colors {
    RED,
    BLUE,
    GREY,
    YELLOW
}

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getSequence() {
        return this.sequence;
    }

    public int getLength() {
        return this.sequence.length();
    }
}
