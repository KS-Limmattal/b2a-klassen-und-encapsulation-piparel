import java.awt.Point;

public class PointTester {
    public static void main(String[] args) {
        Point p = new Point(2,5);
        System.out.println(p.toString());

        p.setLocation(p.getY(), p.getX());

        System.out.println(p.toString());
        Point q = new Point(p);
        System.out.println(q.toString());

    }
}
