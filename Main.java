public class Main {
    public static void main(String[] args) {

        Point a = new Point(1, 2);
        Point b = new Point(4, 6);

        Segment s = new Segment(a, b);

        System.out.println("Length: " + s.length());
    }
}