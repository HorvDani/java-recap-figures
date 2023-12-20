public class Main {
    public static void main(String[] args) {
        double area = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4)).area();
        System.out.println(area);

        double area1 = new Quadrilateral(new Point(1,0), new Point(2, 1), new Point(1, 2), new Point(0, 1)).area();
        System.out.println(area);

        double area2 = new Circle(new Point(1,1), 3).area();
        System.out.println(area);
    }
}