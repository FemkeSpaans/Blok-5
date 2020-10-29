package Afvink7;

public abstract class Sequence {
    public String sequence;
    public int value;

    public void Sequence(String sequence) {
        this.sequence = sequence;
    }
public enum Color {
    RED(0),
    BLUE(1),
    GREY(2),
    YELLOW(3);

    Color(int i) {
    }
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
    public int getColor(int integer){
        this.value = integer;
        return this.value;
    }
}
