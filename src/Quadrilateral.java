import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Quadrilateral extends Figure {

    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;



    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    double length(Point a, Point b) {
        return sqrt(pow(b.getX()-a.getX(),2)+pow(b.getY()-a.getY(),2));
    }

    public double areaOfTriangle(Point a,Point b, Point c){
        double abLength = length(a, b);
        double bcLength = length(b, c);
        double caLength = length(c, a);


        double p = (abLength+bcLength+caLength)*0.5;
        return sqrt(p*(p-abLength)*(p-bcLength)*(p-caLength));

    }


    @Override
    public double area() {
        return areaOfTriangle(a, b, c) + areaOfTriangle(a, c, d);
    }

    @Override
    public String toString() {
        return super.toString() + "]";
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() +"," + a.getY() + ")" + "(" + b.getX() +","
                + b.getY() + ")" +"(" + c.getX() +"," + c.getY() + ")" +
                "(" + d.getX() +"," + d.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        double minX = a.getX();
        double minY = a.getY();

        if(b.getX() < minX) minX = b.getX();
        if(c.getX() < minX) minX = c.getX();
        if(d.getX() < minX) minX = d.getX();

        return new Point(minX, minY);
    }
}
