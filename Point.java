import static java.lang.Math.*;

public class Point{

  private double x;
  private double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double getX(){
    return this.x;
  }
  public double getY(){
    return this.y;
  }


  private void shiftX(double x){
    this.x = this.x + x;
  }
  private void shiftY(double y){
    this.y = this.y + y;
  }
  private double radConvert(int degree){
    return (degree * PI)/ 180;
  }


  public void shift(double x, double y){
    this.x = this.x + x;
    this.y = this.y + y;
  }

  public void shift(int angle, double dist){
    double diffY = dist * sin( degToRad(angle));
    double diffX = dist * cos( degToRad(angle));

    shift(diffX, diffY);
  }


  public static double dist(Point p1, Point p2){
    double xdist = abs(p2.getX() - p1.getX());
    double ydist = abs(p2.getY() - p1.getY());
    return sqrt(pow(xdist, 2) + pow(ydist, 2));
  }

  public double distTo(Point p2){
    double xdist = abs(p2.getX() - this.x);
    double ydist = abs(p2.getY() - this.y);
    return sqrt(pow(xdist, 2) + pow(ydist, 2));
  }

  public String toString(){
    return this.x + ", " + this.y;
  }
}
