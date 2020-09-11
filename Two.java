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
        
        // In a reference type, it references to the object in memory, they do not store the actual values,
        // But a reference to said value. In this cause point1 and point2 reference the same object in memory.
        // These two variables are not independent of each other. Because they both reference the same object,
        // If one changes, so does the other.

        // Using the first reference value to update both
        point1.x = 2;
        System.out.println(point2);
        // Reference types are copied by the references, whereas primitive types are copied by their value,
        // and these values are completely independent of each other. 
        


    }
}
