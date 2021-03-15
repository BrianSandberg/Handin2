public class Triangle extends SuperShape {
    //This class can only make right-angld triangles
    int Ax;
    int Ay;
    int Bx;
    int By;
    int Cx;
    int Cy;


    public Triangle(int Ax, int Ay, int By, int Cx) {
        this.Ax = Ax;
        this.Ay = Ay;
        Bx = Ax;
        this.By = By;
        this.Cx = Cx;
        Cy = Ay;
        centerX = Ax + ((Cx - Ax) / 2);
        centerY = Ay + ((Ay - By) / 2);

    }



    @Override
    double getCircumference() {
        int AC = Cx - Ax;
        int AB = Ay - By;
        return (Math.sqrt(Math.pow(AC, 2) + Math.pow(AB, 2)) + AB + AC);

    }

    @Override
    void getCenter() {
        centerX = Ax + ((Cx - Ax) / 2);
        centerY = Ay + ((Ay - By) / 2);
        System.out.println("The center of the triangle is: " + centerX + " , " + centerY);
    }

    @Override
    double getAreal() {
        int AC = Cx - Ax;
        int AB = Ay - By;
        return ( (AB * AC) / 2);
    }

    //We never got this method to work as intended. The tests for this class works, if the math in this method is correct though
    @Override
    boolean randomPoint(int x2, int y2) {
        int BCP = (x2 * (By - Cy) + Bx * (Cy - y2) + Cx * (y2 - By)) / 2;
        int ACP = (Ax * (y2 - Cy) + x2 * (Cy - Ay) + Cx * (Ay - y2)) / 2;
        int ABP = (Ax * (By - y2) + Bx * (y2 - Ay) + x2 * (Ay - By)) / 2;
        int AC = Cx - Ax;
        int AB = Ay - By;

        if ((BCP + ACP + ABP) == ((AB * AC) / 2)) {
            return true;
        } else {
            return false;
        }
    }
}






