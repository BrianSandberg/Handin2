public class Circle extends SuperShape {
    //Kan kun lave cirkler med samme bredde og højde
    int x;
    int y;
    int diameter;


    public Circle(int x, int y, int diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        centerX = (x + (diameter / 2));
        centerY = (y + (diameter / 2));
    }

    @Override
    void getCircumference() {
        System.out.println("Circumference of circle is = " + (diameter * Math.PI));
    }

    @Override
    void getCenter() {
        centerX = (x + (diameter / 2));
        centerY = (y + (diameter / 2));
        System.out.println("Center of circle is: x = " + centerX + " y = " + centerY);
    }

    @Override
    void getAreal() {
        System.out.println("Circle areal is: " + Math.PI * Math.pow(diameter / 2, 2));
    }

    @Override
    boolean randomPoint(int x2, int y2) {
        double xPoint = x2 - x;
        double yPoint = y2 - y;
        if (((Math.pow(xPoint, 2)) + (Math.pow(yPoint, 2))) < Math.pow((diameter / 2), 2)) {
            return true;
        } else {
            return false;
        }
    }


}

