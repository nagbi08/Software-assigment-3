import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle = new Triangle();

    @Test
    void typeoftriangle()
    {
        String temp = triangle.typeTriangle(1, 2, 0);
        assertSame("Invalid dimensions!", temp);

        temp = triangle.typeTriangle(3, 3, 3);
        assertSame("Equilateral triangle", temp);

        temp = triangle.typeTriangle(7, 3, 3);
        assertSame("Isosceles triangle", temp);

        temp = triangle.typeTriangle(1, 2, 3);
        assertSame("Scalene triangle", temp);
    }

}