// Author: Femke Spaans
// Date: 01.09.2020/02.09.2020
// Summary: about primitive types in java

// Primitive types are used for storing simple values.

public class One {
    public static void main(String[] args) {
        int age = 30; // int can store up to 4 bytes, which allows us to store value up to 2 billion.
        byte ageSecond = 35; // a byte stores only 1 byte, which means values can go up to 127.
        int viewsCount = 123_456_789; // you can use an underscore to separate a large number,
        // the same way one would use a comma (English) or point (Dutch).
        long viewsCountSecond = 3_123_456_789L; // integers that go above 2 billion are to big to be an int.
        // they become a long, however java will still say the number is too long,
        // to combat this you add an L as a suffix to the number.
        double price = 10.99; // with the double you can create a number with a decimal point.
        // However doubles use a lot more bytes than floats.
        float priceSecond = 10.99F; // a float is never recognized as a float but as a double,
        // combat this you add an F as a suffix to the number.
        char letter = 'A'; // a char is used for only one character,
        // when there is only one character single quotes are used. A string is more than one character
        // and always uses double quotes.
        boolean isEligible = true; // a boolean can either be true or false.
        // All the words in java which are made orange are reserved keywords in java!
        // All of the objects are primitive.

    }
}