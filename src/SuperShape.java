public abstract class SuperShape {

   int centerX;
   int centerY;
   double distance;


   abstract void getCircumference();

   abstract void getCenter();

   abstract void getAreal();

   abstract boolean randomPoint(int x2, int y2);

   public void getDistance(SuperShape s){
      double xDistance;
      double yDistance;
      xDistance = Math.abs(s.centerX - centerX);
      yDistance = Math.abs(centerY - s.centerY);
      distance = Math.sqrt(Math.pow((xDistance),2) + Math.pow((yDistance),2));
      System.out.println(distance);
   }


}
