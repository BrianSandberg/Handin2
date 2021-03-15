import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class CircleTest {

    Circle circle = new Circle(50, 50 ,100 );
    Circle circle2 = new Circle (200,250,100);

    @Test
    void getCircumference() {
        assertEquals(314, (int)circle.getCircumference());
    }

    @Test
    void getCenter() {
        assertEquals(100, circle.centerX);
        assertEquals(100, circle.centerY);
    }

    @Test
    void getAreal() {
        assertEquals(7853, (int)circle.getAreal());
    }

    @Test
    void randomPoint() {
        assertEquals(true, circle.randomPoint(55, 60));
        assertEquals(false, circle.randomPoint(10, 20));
    }

    @Test
    void getDistance() {
        assertEquals(250, (int)circle2.getDistance(circle));
    }
}