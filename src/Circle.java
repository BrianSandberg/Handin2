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
    double getCircumference() {
        return ((diameter * Math.PI));
    }

    @Override
    void getCenter() {
        centerX = (x + (diameter / 2));
        centerY = (y + (diameter / 2));
        System.out.println("The center of circle is: " + centerX + " , " + centerY);
    }

    @Override
    double getAreal() {
        return ( Math.PI * Math.pow(diameter / 2, 2));
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

