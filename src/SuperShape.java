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
      xDistance = Math.sqrt(Math.pow((s.centerX - centerX),2));
      yDistance = Math.sqrt(Math.pow((centerY - s.centerY),2));
      distance = Math.sqrt(Math.pow((xDistance),2) + Math.pow((yDistance),2));
      System.out.println(distance);
   }


}
