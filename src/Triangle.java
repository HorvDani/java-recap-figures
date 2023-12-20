class Triangle extends Figure {


    private final Point a;
    private final Point b;
    private final Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double area = (a.getX()*(b.getY() - c.getY()) + b.getX()*(c.getY() - a.getY()) + c.getX()
                *(a.getY() - b.getY())) / 2;
        return Math.abs(area);
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() +"," + a.getY() + ")" + "(" + b.getX() +","
                + b.getY() + ")" +"(" + c.getX() +"," + c.getY() + ")";
    }

    @Override
    public String toString() {
        return super.toString() + "]";
    }

    @Override
    public Point leftmostPoint() {
        double num = Math.min(a.getX(), b.getX());
        return new Point(Math.min(num, c.getX()), 0);
    }
}
