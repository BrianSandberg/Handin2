public class Triangle extends SuperShape {
    //Kan kun lave retvinklede trekanter
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
        int AC = Cx - Ax;
        int AB = Ay - By;
        double ABP = Math.abs((AB * (x2 - Ax))/2);
        double ACP = Math.abs(((Cx - Ax) * (Ay - y2))/2);

        double CBP = Math.abs(((AB * AC) / 2) - ABP - ACP);
        System.out.println(CBP);
        System.out.println(ABP);
        System.out.println(ACP);

        if((CBP + ABP + ACP) == ((AB * AC) / 2)){
            return true;
        } else{
            return false;
        }
    }


}



