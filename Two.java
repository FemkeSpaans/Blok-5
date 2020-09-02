// Author: Femke Spaans
// Date: 02.09.2020
// Summary: About reference types in java

// Reference types are used to store complex objects.
// Primitive and reference types have a very important difference in terms of memory management,
// Primitive types hold the values they own. However reference types, reference the values.

import java.awt.*;

public class Two {
    public static void main(String[] args) {
        byte x = 1; // simple primitive values, they are at different memory locations.
        byte y = x; // They are independent of each other. So if you change x, y stays the same.
        // In references types this behavior is different.
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        


    }
}
