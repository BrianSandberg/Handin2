import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square = new Square(50,40, 60, 50);
    Square square2 = new Square(150, 140, 160, 150);

    @Test
    void getCircumference() {
        assertEquals(40, square.getCircumference());
    }

    @Test
    void getCenter() {
        assertEquals(55, square.centerX);
        assertEquals(45, square.centerY);
    }

    @Test
    void getAreal() {
        assertEquals(100, square.getAreal());
    }

    @Test
    void randomPoint() {
        assertEquals(true, square.randomPoint(55, 45));
        assertEquals(false, square.randomPoint(66,45));
    }

    @Test
    void getDistance() {

        assertEquals(141, (int) square.getDistance(square2));
    }
}