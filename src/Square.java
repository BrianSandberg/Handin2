public class Square extends SuperShape{
    //This class can only make squares with 90 degree corners only
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
    double getCircumference() {
        side1 = Bx-Ax;
        side2 = By-Ay;
       return ((side1*2) + (side2*2));
    }

    @Override
    void getCenter() {
        centerX = Ax + ((Bx-Ax)/2);
        centerY = Ay + ((By-Ay)/2);
        System.out.println("The center of square is: " + centerX + " , " + centerY);
    }

    @Override
    double getAreal() {
        side1 = Bx-Ax;
        side2 = By-Ay;
        return((side1*side2));
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
