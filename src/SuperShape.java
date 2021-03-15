public abstract class SuperShape {

   int centerX;
   int centerY;
   double distance;

   //This method is used to calculate the circumference of a given shape
   abstract double getCircumference();

   //This method is used to find the center of a given shape
   abstract void getCenter();

   //This method is used to find the areal of a given shape
   abstract double getAreal();

   //This method is used to determine whether or not a point, given the methods argument, is inside a given shape, or not
   abstract boolean randomPoint(int x2, int y2);

   //This is the only regular method in this abstract class, and it calculates the distance between the center of two shapes.
   //Every shape needs to have a centerY and centerX variable, for this method to work, but since the calculations are the same for every shape,
   //this seemes like the easiest way to do this
   public double getDistance(SuperShape s){
      double xDistance;
      double yDistance;
      xDistance = Math.abs(s.centerX - centerX);
      yDistance = Math.abs(centerY - s.centerY);
      distance = Math.sqrt(Math.pow((xDistance),2) + Math.pow((yDistance),2));
      return (distance);
   }
}
