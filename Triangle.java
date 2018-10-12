public class Triangle{

  private Point point0;
  private Point point1;
  private Point point2;

  public Triangle(double x0,double y0,double x1,double y1,double x2,double y2){
    point0 = new Point(x0, y0);
    point1 = new Point(x1, y1);
    point2 = new Point(x2, y2);
  }

  public Triangle(Point p0, Point p1, Point p2){
    this.point0 = point0;
    this.point1 = point1;
    this.point2 = point2;
  }

  public Point getVertex(int index){
    Point output;
    output = new Point(getPoint(index).getX(), getPoint(index).getY());
    return output;
  }

  public Point getPoint(int point){
    if (point == 0) return point0;
    if (point == 1) return point1;
    if (point == 2) return point2;
    return new Point(0, 0);
  }

  public void setVertex(int point, Point newp){
    if (point == 0) point0 = newPoint;
    if (point == 1) point1 = newPoint;
    if (point == 2) point2 = newPoint;
  }

  public double getPerimeter(){
    double a, b, c;
    //a = p0.distance(p1);
    //b = p1.distance(p2);
    //c = p2.distance(p0);
    a = Point.dist(point0, point1);
    b = Point.dist(point1, point2);
    c = Point.dist(point2, point0);
    return a + b + c;
  }

  public String toString(){
    return "Triangle: A@" + point0 + " B@" + point1 +" C@" + point2 ;
}
}
