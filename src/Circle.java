class Circle extends Figure{


    private final Point center;
    private final double r;
    public Circle(Point a, double r) {
        this.center = a;
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public String toString() {
        return super.toString() + r + "]";
    }

    @Override
    public String pointsToString() {
        return "(" + center.getX() +"," + center.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {

        return new Point(center.getX() - r, center.getY());
    }
}
