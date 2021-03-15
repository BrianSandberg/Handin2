public class Square extends SuperShape{
    //Kan kun lave firkanter med 4x90 graders vinkler
    int Ax;
    int Ay;
    int Bx;
    int By;
    int side1;
    int side2;


    public Square(int Ax, int Ay, int Bx, int By){
        this.Ax = Ax;
        this.Ay = Ay;
        this.Bx = Bx;
        this.By = By;
        centerX = Ax + ((Bx-Ax)/2);
        centerY = Ay + ((By-Ay)/2);
    }

    @Override
    void getCircumference() {
        side1 = Bx-Ax;
        side2 = By-Ay;
        System.out.println("Circumference of square is: " + (((side1*2) + (side2*2))));
    }

    @Override
    void getCenter() {
        centerX = Ax + ((Bx-Ax)/2);
        centerY = Ay + ((By-Ay)/2);
        System.out.println("Center of square is: " + centerX + ", " + centerY);
    }

    @Override
    void getAreal() {
        side1 = Bx-Ax;
        side2 = By-Ay;
        System.out.println("Areal of square is: " + (side1*side2));
    }

    @Override
    boolean randomPoint(int x2, int y2) {
        if((x2 < Bx &&  x2 > Ax) && (y2 < By && y2 > Ay)){
            return true;
        }else{
            return false;
        }

    }



}
