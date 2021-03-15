import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle = new Triangle(100, 100, 90, 110);
    Triangle triangle2 = new Triangle(200,200,190,210);


    @org.junit.jupiter.api.Test
    void getCircumference() {
        assertEquals((int)34.14,(int) triangle.getCircumference());
    }

    @org.junit.jupiter.api.Test
    void getCenter() {
        assertEquals(105, triangle.centerX);
        assertEquals(105, triangle.centerY);
    }

    @org.junit.jupiter.api.Test
    void getAreal() {
        assertEquals(50, triangle.getAreal());
    }

    @org.junit.jupiter.api.Test
    void randomPoint() {
        assertEquals(true, triangle.randomPoint(102,98));
        assertEquals(false, triangle.randomPoint(0, 0));
    }

    @org.junit.jupiter.api.Test
    void getDistance() {
        assertEquals(141, (int)triangle2.getDistance(triangle));
    }
}