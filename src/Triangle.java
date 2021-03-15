public class Triangle extends SuperShape {
    //Kan kun lave retvinklede trekanter
    int Ax;
    int Ay;
    int Bx;
    int By;
    int Cx;
    int Cy;



    public Triangle(int Ax, int Ay, int Bx, int By, int Cx, int Cy) {
        this.Ax = Ax;
        this.Ay = Ay;
        this.Bx = Bx;
        this.By = By;
        this.Cx = Cx;
        this.Cy = Cy;
        centerX = Ax + ((Cx - Ax) / 2);
        centerY = Ay + ((Ay - By) / 2);
    }

    @Override
    void getCircumference() {
        int AC = Cx - Ax;
        int AB = Ay - By;
        System.out.println("Circumference of triangle is: " + (Math.sqrt(Math.pow(AC, 2) + Math.pow(AB, 2)) + AB + AC));

    }

    @Override
    void getCenter() {
        centerX = Ax + ((Cx - Ax) / 2);
        centerY = Ay + ((Ay - By) / 2);
        System.out.println("Center of triangle is: " + centerX + ", " + centerY);
    }

    @Override
    void getAreal() {
        int AC = Cx - Ax;
        int AB = Ay - By;
        System.out.println("Areal of triangle is: " + (AB * AC) / 2);
    }

    @Override
    boolean randomPoint(int x2, int y2) {
        return false;
    }

}



