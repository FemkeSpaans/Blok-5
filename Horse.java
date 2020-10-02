package Afvink4;

import java.awt.*;
import java.util.Random;

public class Horse {

    String name;
    String breed;
    Color colour;
    Random random = new Random();
    private int x, horseNumber;
    private static int amount = 0;


    public void setName(String horseName) {
        this.name = horseName;
    }

    public String getName() {
        return this.name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public Color getColour() {
        return colour;
    }

    public int getDistance() {
        return this.x;
    }


    public int getHorseNumber() {
        return horseNumber;
    }

    public void setHorseNumber(int horseNumber) {
        this.horseNumber = horseNumber = ++ amount;
    }

    public void loop() {
        this.x = this.x + random.nextInt(11);
    }
}
